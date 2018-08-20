package com.greenfoxacademy.fashionadmin.controllers;

import com.greenfoxacademy.fashionadmin.models.User;
import com.greenfoxacademy.fashionadmin.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {

    private final UserServiceImpl userService;

    @Autowired
    public WebController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/admin/register")
    public String registration(Model model) {
        model.addAttribute("user", new User());
        return "registration";
    }

    @PostMapping("/reg")
    public String greetingSubmit(@ModelAttribute User user, Model userEmailModel) {
        userService.registerNewUser(user);
        userEmailModel.addAttribute("email", user.getEmail());
        return "activation-waiting";
    }

    @GetMapping("/admin/activate/{activation-token}")
    public String activation(@PathVariable("activation-token") String token, Model invalidTokenModel) {
        if (userService.userActivation(token).equals("invalidToken")) {
            invalidTokenModel.addAttribute("invalidToken", token);
            return "invalid-token";
        }
        return "profile";
    }
}
