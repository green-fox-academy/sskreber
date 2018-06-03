package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class RESTGreetCounterController {
    AtomicLong id = new AtomicLong(0);
    @RequestMapping("/greeting")
    public Greeting greetWithName(@RequestParam("name") String name) {
        id.incrementAndGet();
        Greeting greeting = new Greeting(id, "Hello, " + name);
        return greeting;
    }
}