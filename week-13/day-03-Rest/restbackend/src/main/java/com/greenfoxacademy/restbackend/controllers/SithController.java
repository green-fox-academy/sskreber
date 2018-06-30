package com.greenfoxacademy.restbackend.controllers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.greenfoxacademy.restbackend.models.Input;
import com.greenfoxacademy.restbackend.services.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SithController {

    RestService restService;

    @Autowired
    public SithController(RestService restService) {
        this.restService = restService;
    }

    @PostMapping("sith")
    public Object createYodaSpeakFromInputSentence(@RequestBody(required = false) Input inputSentence) {
        return restService.createYodaSpeak(inputSentence.getText());
    }
}
