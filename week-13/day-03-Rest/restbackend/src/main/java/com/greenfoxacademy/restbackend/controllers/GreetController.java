package com.greenfoxacademy.restbackend.controllers;

import com.greenfoxacademy.restbackend.models.Error;
import com.greenfoxacademy.restbackend.models.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    Message welcomeMessage = new Message();
    public Error error = new Error();

    @GetMapping(value = "greeter")
    public Object getGreeting(@RequestParam(value = "name", required = false) String name,
                              @RequestParam(value = "title", required = false) String title) {

        if (name != null && title != null) {
            welcomeMessage.setWelcomeMessage("Oh, hi there " + name + ", my dear " + title + "!");
            return welcomeMessage;
        } else if (name == null) {
            error.setError("Please provide a name!");
        } else if (title == null) {
            error.setError("Please provide a title!");
        } else {
            error.setError("Please provide a name and a title!");
        }
        return error;
    }
}
