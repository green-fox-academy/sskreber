package com.greenfoxacademy.restbackend.controllers;

import com.greenfoxacademy.restbackend.models.Error;
import com.greenfoxacademy.restbackend.models.Until;
import com.greenfoxacademy.restbackend.services.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoUntilController {

    RestService restService;

    @Autowired
    public DoUntilController(RestService restService) {
        this.restService = restService;
    }

    @PostMapping("/dountil/{what}")
    public Object doInputOperationUntilInputNumber(@PathVariable(value = "what") String action,
                                                   @RequestBody(required = false) Until until) {

        return restService.doSomeMaths(until, action);
    }
}
