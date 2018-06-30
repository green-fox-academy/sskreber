package com.greenfoxacademy.restbackend.controllers;

import com.greenfoxacademy.restbackend.services.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendaController {

    RestService restService;

    @Autowired
    public AppendaController(RestService restService) {
        this.restService = restService;
    }

    @GetMapping("appenda/{appendable}")
    public Object showAppenda(@PathVariable(value = "appendable") String appendable) {
        return restService.showAppendedWord(appendable);
    }
}
