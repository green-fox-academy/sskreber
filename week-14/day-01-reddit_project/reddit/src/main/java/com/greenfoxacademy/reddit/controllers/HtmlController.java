package com.greenfoxacademy.reddit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    @GetMapping("/")
    public String renderMainPage() {
        return "whateverthepagesnameis";
    }
}
