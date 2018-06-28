package com.greenfoxacademy.restbackend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DoublingController {

    @GetMapping(value = "/doubling")
    public Map doubleInputNumber(@RequestParam(value = "input") Long input) {

        if (input != 0) {
            Map<String, Long> resultOutput = new HashMap<String, Long>() {{
                put("received", input);
                put("result", input * 2);
            }};
            return resultOutput;
        } else {
            Map<String, String> errorOutput = new HashMap<String, String>();
            errorOutput.put("error", "Please provide an input!");
            return errorOutput;
        }
    }
}
