package com.steer.careers.job.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.omg.CORBA.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Service;

import com.steer.careers.job.model.Job;
import com.steer.careers.job.repository.JobPostRepository;
import com.steer.careers.job.service.JobPostService;
import com.steer.careers.user.model.User;
import com.steer.careers.user.repository.UserRepository;

@Service
public class JobPostServiceImpl implements JobPostService {
	@Autowired
	private JobPostRepository jobrepository;

	@Autowired
	private UserRepository userRepository;

	@Override
	public Long jobPost(Job job) {
		System.out.println("job service impl data : " + job);

		Job savingJob = job;

		try {
			User user = userRepository.findById(job.getUser().getId()).get();
			System.out.println("user in jobpostimpl : " + user);
			savingJob.setUser(user);
			user.getJobs().add(savingJob);

		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}

		if (job != null) {
			savingJob = jobrepository.save(savingJob);
			return savingJob.getJobId();
		}

		return null;
	}

	@Override
	public List<Job> jobList() {
		List<Job> job = new ArrayList<Job>();
		job = jobrepository.findAll();
		if (job != null) {
			return job;
		}

		return null;
	}

	@Override
	public List<Job> jobByUserId(Long id) {

		try {
			System.out.println("jobByUserid"+id);
			List<Job> jobList = new ArrayList<Job>();

			jobList =jobrepository.findByUser(userRepository.findById(id));

			if (jobList != null) {
				return jobList;
			}
		} catch (NoSuchElementException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

}
