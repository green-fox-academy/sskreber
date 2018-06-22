package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.models.Drink;
import com.greenfoxacademy.programmerfoxclub.models.Food;
import com.greenfoxacademy.programmerfoxclub.models.Fox;
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

    @GetMapping("/nutritionstore")
    public String getNutritionStore(@RequestParam(value = "name", required = false) String name, Model nutritionModel) {
        if (name == null) {
            return "login";
        } else {
            Fox fox = foxService.getFoxByName(name);
            nutritionModel.addAttribute("name", name);
            nutritionModel.addAttribute("fox", fox);
            return "nutritionpage";
        }
    }

    @PostMapping(value = "nutritionstoreupdate")
    public String updatePetsChosenFoodAndDrink(Model updatedFoxModel,
                                               @RequestParam(value = "name") String name,
                                               @RequestParam(value = "fox") Fox fox,
                                               @RequestParam(value = "food") Food food,
                                               @RequestParam(value = "drink") Drink drink) {

        foxService.getFoxByName(name).setDrink(drink);
        foxService.getFoxByName(name).setFood(food);
        updatedFoxModel.addAttribute("name", name);
        return "redirect:/?name=" + name;
    }
}
