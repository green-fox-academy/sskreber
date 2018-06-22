package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private FoxService foxService;

    @Autowired
    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping("/")
    public String indexPage(Model nameModel, @RequestParam(value = "name", required = false) String name) {
        if (name == null) {
            return "login";
        } else {
            nameModel.addAttribute("name", name);
            nameModel.addAttribute("numberoftricks", foxService.getFoxByName(name).getNumberOfTricks());
            return "index";
        }
    }

    @GetMapping(value = "/login")
    public String login() {
        return "login";
    }

    @PostMapping(value = "/submitname")
    public String login(@RequestParam(value = "name") String name) {
        if (foxService.doesFoxNameExist(name)) {
            return "redirect:/?name=" + name;
        } else {
            return "register";
        }
    }

    @PostMapping(value = "/registername")
    public String register(@RequestParam(value = "name") String name) {
        foxService.saveFox(new Fox(name));
        return "redirect:/?name=" + name;
    }
}
