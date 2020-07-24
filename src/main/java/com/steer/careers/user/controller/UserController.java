package com.steer.careers.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.steer.careers.user.model.User;
import com.steer.careers.user.service.UserService;

@Controller
@RestController
@RequestMapping("/")
public class UserController {
	@Autowired
	private UserService service;
	
	@PostMapping("/register")
	public ResponseEntity<?> userregistration(@RequestBody User user){
		Long userid=service.userRegistration(user);
		if(userid!= null)
			return new ResponseEntity<>("user registration success : user id : " +userid ,HttpStatus.OK);
		return new ResponseEntity<>("registration failed ", HttpStatus.BAD_REQUEST);
		
		
		
	}

	

	
	 
	

}
