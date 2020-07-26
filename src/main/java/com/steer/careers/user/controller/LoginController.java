package com.steer.careers.user.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.steer.careers.user.dto.LoginDTO;
import com.steer.careers.user.service.LoginService;

@RestController
@RequestMapping("/")
public class LoginController {
	
	@Autowired
	private LoginService loginservice;
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody LoginDTO dto) {
		
		
		Long userId = loginservice.Login(dto.getEmail(),dto.getPwd());
		
		if(userId !=null)
			return new ResponseEntity<>("Login Success "+userId,HttpStatus.OK);
		return new ResponseEntity<>("Incorrect Email or Password", HttpStatus.UNAUTHORIZED);
	}

}
