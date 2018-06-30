package com.greenfoxacademy.restbackend.services;

import com.greenfoxacademy.restbackend.models.Error;
import com.greenfoxacademy.restbackend.models.Message;
import org.springframework.stereotype.Service;

@Service
public class RestService {

    public Message message;
    public Error error;

    public Object showGreeting(String name, String title) {
        Message welcomeMessage = new Message();
        Error error = new Error();

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
