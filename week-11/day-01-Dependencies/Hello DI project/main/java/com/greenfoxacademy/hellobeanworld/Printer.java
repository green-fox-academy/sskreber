package com.greenfoxacademy.hellobeanworld;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer {

    public Printer() {
        System.out.println(LocalDateTime.now() + "hey I am created now");
    }

    public void log(String message) {
        System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
    }
}