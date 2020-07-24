package com.steer.careers.job.repository;



import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.steer.careers.job.model.Job;
import com.steer.careers.user.model.User;

public interface JobPostRepository extends JpaRepository<Job, Long>{
	
	public List<Job> findByUser(Optional<User> optional);

	

}
 