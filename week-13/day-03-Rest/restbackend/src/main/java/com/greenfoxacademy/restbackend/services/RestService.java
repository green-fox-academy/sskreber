package com.greenfoxacademy.restbackend.services;

import com.greenfoxacademy.restbackend.models.Appended;
import com.greenfoxacademy.restbackend.models.Error;
import com.greenfoxacademy.restbackend.models.Message;
import com.greenfoxacademy.restbackend.models.Until;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

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

    public Object doSomeMaths(Until until, String what) {
        if (until == null) {
            return new Error("Please provide a number!");
        }

        List<Integer> numbersUntilInputNumber = new ArrayList<>();
        for (int i = 1; i <= until.getUntil(); i++) {
            numbersUntilInputNumber.add(i);
        }

        if (what.equals("sum")) {
            return numbersUntilInputNumber.stream().mapToInt(Integer::intValue).sum();
        } else if (what.equals("factor")) {
            return IntStream.rangeClosed(2, until.getUntil()).reduce(1, (x, y) -> x * y);
        } else {
            return new Error("Please provide an action!");
        }
    }
}
