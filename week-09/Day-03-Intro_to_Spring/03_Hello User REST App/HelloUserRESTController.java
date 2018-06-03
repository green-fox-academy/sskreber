package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloUserRESTController {
    @RequestMapping("/greeting")
    public Greeting greetWithName(@RequestParam("name") String name) {
        return new Greeting(1, "Hello, " + name);
    }
}

// At http://localhost:8080/greeting?name=Your%20name
// it returns & displays:
// {"id":1,"content":"Hello, Your name"}

// At http://localhost:8080/greeting?name=Karap%20Zsu
// it returns & displays:
// {"id":1,"content":"Hello, Karap Zsu"}

