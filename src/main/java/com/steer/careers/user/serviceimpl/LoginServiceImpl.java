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
	public boolean Login(String email, String pwd) {
		
		User user= userrepo.findByEmailAndPwd(email, pwd);
	 
		if(user!=null) {
			
			userrepo.save(user);  
		return   true;
		}
		return false;
		
		
	}
}
 