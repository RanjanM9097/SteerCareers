package com.steer.careers.job.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.steer.careers.job.model.Job;
import com.steer.careers.job.service.JobPostService;


@Controller
@RequestMapping("/")
public class JonPostController {
	@Autowired
	private JobPostService jobservice;
	 @PostMapping("/jobpost")
		public ResponseEntity<?> jobPost(@RequestBody Job job) {
			
			Long jobId =jobservice.jobPost(job);
			
			if(jobId != null)
				return new ResponseEntity<>("job post success : "+jobId ,HttpStatus.OK);
			return new ResponseEntity<>("job post failed ", HttpStatus.BAD_REQUEST);
		}
}
