package com.greenfoxacademy.bankofsimba.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EnjoyController {

    public EnjoyController() {
    }

    @GetMapping("enjoy")
    public String displayEnjoy(Model model) {
        String enjoyMessage = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
        model.addAttribute("enjoyMessage", enjoyMessage);
        return "enjoy";
    }
}
