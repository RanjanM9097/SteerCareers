package com.steer.careers.user.service;

import com.steer.careers.user.model.User;

public interface UserService {
  public Long userRegistration(User user);

     public String setAlphaNumericString(int id);
   
}
