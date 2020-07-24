package com.steer.careers.job.service;

import java.util.List;

import com.steer.careers.job.model.Job;

public interface JobPostService {
	public Long jobPost(Job job);
	public List<Job> jobList();
	public List<Job> jobByUserId(Long id);

}
