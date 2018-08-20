package com.greenfoxacademy.fashionadmin.services;

import com.greenfoxacademy.fashionadmin.models.User;



public interface UserService {

    String registerNewUser(User usertoRegister);

    String userActivation(String token);
}
