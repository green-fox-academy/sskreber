package com.greenfoxacademy.hellobeanworld.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ValidateEmailService {

    public boolean validateEmail(String inputEmail) {
        boolean isValidEmail = false;
        char[] inputEmailCharArray = inputEmail.toCharArray();
        List<Character> inputEmailList = new ArrayList<>();
        for (char Char : inputEmailCharArray) {
            inputEmailList.add(Char);
        }
        if (!inputEmailList.contains('@')) {
            return isValidEmail;
        }

        for (int i = inputEmailList.indexOf('@') + 1; i < inputEmailList.size(); i++) {
            if (inputEmailList.get(i).equals('.')) {
                isValidEmail = true;
            }
        }
        return isValidEmail;
    }
}
