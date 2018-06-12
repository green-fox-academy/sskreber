package com.greenfoxacademy.hellobeanworld;

import org.springframework.stereotype.Service;

@Service
public class MyColorImplRed implements MyColor {

    @Override
    public void printColor() {
        System.out.println("It is red in colour...");
    }
}
