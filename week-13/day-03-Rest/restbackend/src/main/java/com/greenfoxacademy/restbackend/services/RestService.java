package com.greenfoxacademy.restbackend.services;

import com.greenfoxacademy.restbackend.models.*;
import com.greenfoxacademy.restbackend.models.Error;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class RestService {

    public Object showGreeting(String name, String title) {

        if (name != null && title != null) {
            Message welcomeMessage = new Message();
            welcomeMessage.setWelcomeMessage("Oh, hi there " + name + ", my dear " + title + "!");
            return welcomeMessage;
        } else if (name == null) {
            return returnSpecificError("Please provide a name!");
        } else if (title == null) {
            return returnSpecificError("Please provide a title!");
        } else {
            return returnSpecificError("Please provide a name and a title!");
        }
    }

    public Object showAppendedWord(String wordToAppend) {
        Appended appended = new Appended();
        appended.setAppended(wordToAppend + "a");
        return appended;
    }

    public Object doSomeMaths(Input inputUntilWhatNumber, String what) {

        if (inputUntilWhatNumber.getUntil() == null) {
            return returnSpecificError("Please provide a number!");
        }

        Integer until = inputUntilWhatNumber.getUntil();
        List<Integer> numbersUntilInputNumber = new ArrayList<>();
        for (int i = 1; i <= until; i++) {
            numbersUntilInputNumber.add(i);
        }

        if (what.equals("sum")) {
            return numbersUntilInputNumber.stream().mapToInt(Integer::intValue).sum();
        } else if (what.equals("factor")) {
            return IntStream.rangeClosed(2, until).reduce(1, (x, y) -> x * y);
        } else {
            return returnSpecificError("Please provide an action!");
        }
    }

    public Object doInputOperationOnInputArray(String inputWhat, int[] inputNumbers) {
        if (inputWhat != null && inputNumbers != null) {
            List<Integer> numberList = new ArrayList<>();
            for (int number : inputNumbers) {
                numberList.add(number);
            }
            if (inputWhat.equals("sum")) {
                return numberList.stream().mapToInt(Integer::intValue).sum();
            } else if (inputWhat.equals("multiply")) {
                return numberList.stream().reduce(1, (a, b) -> a * b);
            } else if (inputWhat.equals("double")) {
                return numberList.stream().mapToInt(i -> i * 2).boxed().collect(Collectors.toList());
            }
        }
        return returnErrorToWrongInputOperationOrArray(inputWhat, inputNumbers);
    }

    public Object returnErrorToWrongInputOperationOrArray(String inputWhat, int[] inputNumbers) {
        if (inputWhat != null && inputNumbers == null) {
            return returnSpecificError("Please provide numbers to perform an operation on!");
        } else if (inputWhat == null && inputNumbers != null) {
            return returnSpecificError("Please provide what to do with the numbers!");
        } else {
            return returnSpecificError("Please provide a valid operation and numbers to perform it on!");
        }
    }

    public Error returnSpecificError(String errorMessage) {
        return new Error(errorMessage);
    }
}
