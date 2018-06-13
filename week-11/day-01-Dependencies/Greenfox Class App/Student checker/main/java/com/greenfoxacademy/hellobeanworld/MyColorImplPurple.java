package com.greenfoxacademy.hellobeanworld;

import org.springframework.stereotype.Service;

@Service
public class MyColorImplPurple implements MyColor {

    @Override
    public void printColor() {
        System.out.println("It is purple in colour...");
    }
}
