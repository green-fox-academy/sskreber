package com.greenfoxacademy.hellobeanworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyColorImplGreen implements MyColor {

    @Override
    public void printColor() {
        System.out.println("It is green in colour...");
    }
}
