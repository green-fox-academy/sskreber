package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.models.Drink;
import com.greenfoxacademy.programmerfoxclub.models.Food;
import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.models.Trick;
import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TrickController {

    FoxService foxService;

    @Autowired
    public TrickController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping("/trickcentre")
    public String getTrickCentre(@RequestParam(value = "name", required = false) String name, Model trickModel) {
        if (name == null) {
            return "login";
        } else {
            Fox fox = foxService.getFoxByName(name);
            trickModel.addAttribute("name", name);
            trickModel.addAttribute("fox", fox);
            return "trickcentre";
        }
    }

    @PostMapping(value = "trickcentreupdate")
    public String updatePetsLearnedTRicks(Model updatedFoxModel,
                                               @RequestParam(value = "name") String name,
                                               @RequestParam(value = "newtrick") Trick newTrick) {

        foxService.getFoxByName(name).learnNewTrick(newTrick);
        updatedFoxModel.addAttribute("name", name);
        return "redirect:/?name=" + name;
    }
}
