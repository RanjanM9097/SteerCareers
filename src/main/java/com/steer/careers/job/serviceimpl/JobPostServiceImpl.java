package com.steer.careers.job.serviceimpl;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
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
		
		Job savingJob = new Job();
		
		try {
			User user = userRepository.findById(job.getUser().getId()).get();
			savingJob.setUser(user);
			user.getJobs().add(savingJob);
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		
		if(job !=null) {
			savingJob = jobrepository.save(savingJob);
			return savingJob.getJobId();
		}
		
		return null;
	}

}
