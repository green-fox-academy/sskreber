package com.greenfoxacademy.restbackend.services;

import com.greenfoxacademy.restbackend.models.Appended;
import com.greenfoxacademy.restbackend.models.Error;
import com.greenfoxacademy.restbackend.models.Message;
import org.springframework.stereotype.Service;

@Service
public class RestService {

    public Object showGreeting(String name, String title) {
        Error error = new Error();

        if (name != null && title != null) {
            Message welcomeMessage = new Message();
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

    public Object showAppendedWord(String wordToAppend) {
        Appended appended = new Appended();
        appended.setAppended(wordToAppend + "a");
        return appended;
    }
}
