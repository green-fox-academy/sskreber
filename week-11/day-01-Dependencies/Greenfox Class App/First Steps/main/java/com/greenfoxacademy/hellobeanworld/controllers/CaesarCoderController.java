package com.greenfoxacademy.hellobeanworld.controllers;

import com.greenfoxacademy.hellobeanworld.services.CaesarCoderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaesarCoderController {
    private final CaesarCoderService caesarCoderService;
    private String result = "";
    private final String ENTER_TEXT_INTO_URL_PROMPT = "Please enter text to encode/decode.";

    @Autowired
    public CaesarCoderController(CaesarCoderService caesarCoderService) {
        this.caesarCoderService = caesarCoderService;
    }

    //NOTE TO SELF: example url: http://localhost:8080/useful/encodecaesar?text=abc&number=1
    @GetMapping("useful/encodecaesar")
    public String encodeCaesar(Model encodeCaesarModel, @RequestParam(value = "text", required = false, defaultValue = ENTER_TEXT_INTO_URL_PROMPT) String text, @RequestParam(value = "number", required = false, defaultValue = "0") int number) {
        if (text.equals(ENTER_TEXT_INTO_URL_PROMPT)) {
            result = ENTER_TEXT_INTO_URL_PROMPT;
        } else {
            result = caesarCoderService.caesar(text, number);
        }
        encodeCaesarModel.addAttribute("encodedResult", result);
        return "encodecaesar";
    }

    //NOTE TO SELF: example url: http://localhost:8080/useful/encodecaesar?text=cde&number=1
    @GetMapping("useful/decodecaesar")
    public String decodeCaesar(Model decodeCaesarModel, @RequestParam(value = "text", required = false, defaultValue = ENTER_TEXT_INTO_URL_PROMPT) String text, @RequestParam(value = "number", required = false, defaultValue = "0") int number) {
        if (text.equals(ENTER_TEXT_INTO_URL_PROMPT)) {
            result = ENTER_TEXT_INTO_URL_PROMPT;
        } else {
            result = caesarCoderService.caesar(text, - number);
        }
        decodeCaesarModel.addAttribute("decodedResult", result);
        return "decodecaesar";
    }
}

