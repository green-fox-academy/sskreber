package com.greenfoxacademy.programmerfoxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String indexPage(Model nameModel, @RequestParam(value = "name", required = false) String name) {
        if (name == null) {
            return "login";
        } else {
            nameModel.addAttribute("name", name);
            return "index";
        }
    }

    @GetMapping(value = "/login")
    public String login() {
        return "login";
    }

    @PostMapping(value = "/submitname")
    public String login(@RequestParam(value = "name") String name) {
        return "redirect:/?name=" + name;
    }
}
