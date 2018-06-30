package com.greenfoxacademy.restbackend.controllers;

import com.greenfoxacademy.restbackend.models.*;
import com.greenfoxacademy.restbackend.services.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.Error;

@RestController
public class ArrayHandlerController {

    RestService restService;

    @Autowired
    public ArrayHandlerController(RestService restService) {
        this.restService = restService;
    }

    @PostMapping("/arrays")
    public Object operateOnInputArray(@RequestBody(required = false) Input requestbody) {
        if (requestbody == null) {
            return new Error("No input whatsoever?");
        }
        return restService.doInputOperationOnInputArray(requestbody.getWhat(), requestbody.getNumbers());
    }
}
