package com.greenfoxacademy.hellobeanworld.services;

import org.springframework.stereotype.Service;

@Service
public class CaesarCoderService {

    public String caesar(String text, int number) {
        String result = "";
        for(int i = 0; i < text.length(); i++) {
            result += (char)((int)text.charAt(i) + number);
        }
        return result;
    }
}
