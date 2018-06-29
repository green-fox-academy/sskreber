package com.greenfoxacademy.restbackend.controllers;

import com.greenfoxacademy.restbackend.models.Result;
import com.greenfoxacademy.restbackend.models.Error;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoublingController {

    public Result result = new Result();
    public Error error = new Error();

    @GetMapping(value = "/doubling")
    public Object doubleInputNumber(@RequestParam(value = "input", required = false) Integer input) {
        if (input != null) {
            result.setResult(input, input * 2);
            return result;
        } else {
            error.setError("Please provide an input!");
            return error;
        }
    }
}
