package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NutritionController {

    FoxService foxService;

    @Autowired
    public NutritionController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping(value = "/nutrition/")
    public String redirectToNutritionPage() {
        String name = FoxService.getLoggedInFox().getName();
        return "redirect:/nutritionstore/?name=" + name;
    }

    @GetMapping("/nutritionstore/")
    public String getNutritionPage(Model nutritionModel) {
        nutritionModel.addAttribute("loggedinfox", FoxService.getLoggedInFox());
        return "nutritionpage";
    }
}
