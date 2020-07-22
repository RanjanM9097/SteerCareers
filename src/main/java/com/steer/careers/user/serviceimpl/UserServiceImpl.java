package com.steer.careers.user.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.steer.careers.user.model.User;
import com.steer.careers.user.repository.UserRepository;
import com.steer.careers.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository repository;
	
	@Override
	public String setAlphaNumericString(int id) {

        // chose a Character random from this String 
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 
        // create StringBuffer size of AlphaNumericString 
        StringBuilder sb = new StringBuilder(id); 
        for (int i = 0; i <id; i++) { 
  
            // generate a random number between 
            // 0 to AlphaNumericString variable length 
            int index = (int)(AlphaNumericString.length() * Math.random());              
            // add Character one by one in end of sb 
            sb.append(AlphaNumericString.charAt(index));                
        }
        return sb.toString(); 
	}
	@Override
	public boolean usrerRegistration(User user) {
		
		System.out.println("userservice : data "+user.toString());
		
		if(user!=null) {
			repository.save(user);
			return true;
		}
		
		return false;
	}
	
}
