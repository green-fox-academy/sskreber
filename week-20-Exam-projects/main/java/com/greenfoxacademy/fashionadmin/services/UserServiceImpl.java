package com.greenfoxacademy.fashionadmin.services;

import com.greenfoxacademy.fashionadmin.models.User;
import com.greenfoxacademy.fashionadmin.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final SendGridMailService sendGridMailService;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, SendGridMailService sendGridMailService) {
        this.userRepository = userRepository;
        this.sendGridMailService = sendGridMailService;
    }


    @Override
    public String registerNewUser(User usertoRegister) {
        User userCheck = userRepository.findUserByEmail(usertoRegister.getEmail());
        if (userCheck != null)
            return "alreadyExist";

        usertoRegister.setEnabled(false);
        String token = generateKey();
        usertoRegister.setActivation(token);
        userRepository.save(usertoRegister);
        String URL = "http://localhost:8080/admin/activate/" + token;
        sendGridMailService.sendMail(usertoRegister.getEmail(), URL);

        return "saved";
    }

    public String generateKey() {
        Random rnd = new Random();
        char[] word = new char[60];
        for (int i = 0; i < word.length; i++) {
            word[i] = (char) ('a' + rnd.nextInt(26));
        }
        return new String(word);
    }


    @Override
    public String userActivation(String token) {
        User userToActivate = userRepository.findUserByActivation(token);
        if (userToActivate == null)
            return "invalidToken";

        userToActivate.setEnabled(true);
        userToActivate.setActivation("");
        userRepository.save(userToActivate);
        return "activated";
    }
}
