package com.greenfox.error.controllers;

import com.greenfox.error.services.UserService;
import org.springframework.web.bind.annotation.RequestParam;
import com.greenfox.error.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {

    UserService userService;

    public AppController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("users", userService.getAll());
        return "main";
    }

    @PostMapping("/app")
    public String create(Model model,
                         @RequestParam(value = "firstName") String firstName,
                         @RequestParam(value = "lastName") String lastName) {
        userService.save(new User(firstName, lastName));
        model.addAttribute("users", userService.getAll());
        return "redirect:/";
    }
}
