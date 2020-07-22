package com.steer.careers.job.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.steer.careers.job.model.Job;

public interface JobPostRepository extends JpaRepository<Job, Long>{

}
