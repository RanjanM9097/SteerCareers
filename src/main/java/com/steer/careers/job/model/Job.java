package com.steer.careers.job.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.steer.careers.user.model.User;


@Entity
public class Job {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="jobid")
	private long jobId;
	
	private String experience;
	private String  validity;
	private String location;
	
	@Column(name="jobtitle")
	private String jobTitle;
	
	@Column(name="company")
	private String companyName;
	
	@Column(name="type")
	private String jobType;
	
	@ManyToOne()
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public long getJobId() {
		return jobId;
	}
	public void setJobId(long jobId) {
		this.jobId = jobId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getValidity() {
		return validity;
	}
	public void setValidity(String validity) {
		this.validity = validity;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", experience=" + experience + ", validity=" + validity + ", location="
				+ location + ", jobTitle=" + jobTitle + ", companyName=" + companyName + ", jobType=" + jobType
				+ ", user=" + user + "]";
	}
	
}
