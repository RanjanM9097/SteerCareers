package com.steer.careers.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	public String userRegistration(@RequestBody User user) {
		  user.setRegId(service.setAlphaNumericString(10));
		System.out.println("contoller :user value"+user.toString());
		
		if(user!=null) {
			service.usrerRegistration(user);
		 
		return "Registration success" ;
		}
		return "Registration faild";
		
	}

	
	 
	

}
