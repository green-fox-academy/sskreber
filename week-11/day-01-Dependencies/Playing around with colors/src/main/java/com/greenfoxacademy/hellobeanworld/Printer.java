package com.greenfoxacademy.hellobeanworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer {

    @Qualifier(value = "myColorImplGreen")
    @Autowired
    MyColor myColor;

    public Printer() {
        System.out.println(LocalDateTime.now() + "hey printer has been created now");
    }

    public void log(String message) {
        myColor.printColor();
        System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
    }
}