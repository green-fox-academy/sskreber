package com.greenfoxacademy.programmerfoxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(value = "/index")
    public String indexPage() {
        return "index";
    }
}
