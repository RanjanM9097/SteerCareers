package com.steer.careers.job.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.steer.careers.job.model.Job;
import com.steer.careers.job.service.JobPostService;


@Controller
@RequestMapping("/")
public class JobPostController {
	@Autowired
	private JobPostService jobservice;
	 @PostMapping("/jobpost")
		public ResponseEntity<?> jobPost(@RequestBody Job job) {
			
			Long jobId =jobservice.jobPost(job);
			
			if(jobId != null) 
				return new ResponseEntity<>("job post success : job id :" +jobId ,HttpStatus.OK);
			return new ResponseEntity<>("job post failed ", HttpStatus.BAD_REQUEST);
			
		}
	 @GetMapping("list")
	 public ResponseEntity<?> jobList(){
		 List<Job> listJob = jobservice.jobList();
		 
		if(listJob!=null) 
		         	return new ResponseEntity<>("Posted job :" +listJob ,HttpStatus.OK);
		
		
		return new ResponseEntity<>("Not job avilable ", HttpStatus.BAD_REQUEST);
	
		 
	 }
	 
	@GetMapping("getByid/{id}")
	 public ResponseEntity<?> jobListById(@PathVariable  Long id){
		 List<Job> listJob = jobservice.jobByUserId(id);
		 
		if(listJob!=null) 
		         	return new ResponseEntity<>("Posted job by user  :" +listJob ,HttpStatus.OK);
		
		
		return new ResponseEntity<>("Not job posted by user "+id, HttpStatus.BAD_REQUEST);
	
		 
	 }
	 
	 
	 
	 
}
