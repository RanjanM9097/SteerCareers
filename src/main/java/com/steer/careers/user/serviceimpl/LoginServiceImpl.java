package com.steer.careers.user.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.steer.careers.user.model.User;
import com.steer.careers.user.repository.UserRepository;
import com.steer.careers.user.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	private UserRepository userrepo;
	
	

	@Override
	public Long Login(String email, String pwd) {
		List<User> user = new ArrayList<>();
	 
		if(email!=null && pwd !=null) {
			userrepo.save(userrepo.findByEmailAndPwd(email, pwd));
		user=(List<User>) userrepo.findAll();
		}
		return null;
		
		
	}
}
 