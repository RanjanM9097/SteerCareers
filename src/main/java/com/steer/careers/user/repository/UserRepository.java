package com.steer.careers.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.steer.careers.user.model.User;

@Repository
@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User,Long> {

	User findByEmailAndPwd(String email, String pwd);
	
	User findById(String role);

}
