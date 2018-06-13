package com.greenfoxacademy.hellobeanworld.controllers;

import com.greenfoxacademy.hellobeanworld.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsefulUtilitiesController {

    private final UtilityService utilityService;

    @Autowired
    public UsefulUtilitiesController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("useful")
    public String getMainPage() {
        return "useful";
    }

    @GetMapping("useful/colored")
    public String getColoredPage(Model model) {
        model.addAttribute("randomColour", utilityService.randomColor());
        return "colored";
    }

}
