package com.greenfoxacademy.hellobeanworld;

import com.greenfoxacademy.hellobeanworld.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer {

    private final MyColor myColor;

    @Autowired
    public Printer(@Qualifier("myColorImplGreen") MyColor myColor) {
        System.out.println(LocalDateTime.now() + "Hey printer has been created now");
        this.myColor = myColor;
    }

    public void log(String message) {
        myColor.printColor();
        System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
    }
}