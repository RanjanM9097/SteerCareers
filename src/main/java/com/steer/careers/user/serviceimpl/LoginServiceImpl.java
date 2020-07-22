package com.steer.careers.user.serviceimpl;

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
		System.out.println(email);
		System.out.println(pwd);
		
		User reg = userrepo.findByEmailAndPwd(email, pwd);
		//System.out.println("userrepo "+reg);
		if(reg != null) {
			return reg.getId();
		}
		return null;
	}
}
