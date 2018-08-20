package com.greenfoxacademy.fashionadmin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

@Controller
public class ErrorHandlerController implements ErrorController {

    private static final String ERROR_PATH = "/error";

    private ErrorAttributes errorAttributes;

    @Autowired
    public void setErrorAttributes(ErrorAttributes errorAttributes) {
        this.errorAttributes = errorAttributes;
    }

    @GetMapping(ERROR_PATH)
    public String getErrorPage(Model model, WebRequest webReq) {
        Map<String, Object> errorMap = this.errorAttributes.getErrorAttributes(webReq, true);

        model.addAttribute("timestamp", errorMap.get("timestamp"));
        model.addAttribute("error", errorMap.get("error"));
        model.addAttribute("message", errorMap.get("message"));
        model.addAttribute("path", errorMap.get("path"));
        model.addAttribute("status", errorMap.get("status"));

        return "general-error-page";
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}
