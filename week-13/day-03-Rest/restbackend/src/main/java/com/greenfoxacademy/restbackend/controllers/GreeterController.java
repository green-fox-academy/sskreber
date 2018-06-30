package com.greenfoxacademy.restbackend.controllers;

import com.greenfoxacademy.restbackend.services.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

    RestService restService;

    @Autowired
    public GreeterController(RestService restService) {
        this.restService = restService;
    }

    @GetMapping(value = "greeter")
    public Object getGreeting(@RequestParam(value = "name", required = false) String name,
                              @RequestParam(value = "title", required = false) String title) {
        return restService.showGreeting(name, title);
    }
}
