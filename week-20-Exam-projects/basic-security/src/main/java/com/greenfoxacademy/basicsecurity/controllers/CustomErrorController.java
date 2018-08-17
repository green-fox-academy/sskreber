package com.greenfoxacademy.basicsecurity.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

@RestController
public class CustomErrorController implements ErrorController {

    private static final String ERROR_PATH = "/error";
    private ErrorAttributes errorAttributes;

    @Autowired
    public void setErrorAttributes(ErrorAttributes errorAttributes) {
        this.errorAttributes = errorAttributes;
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }

    @GetMapping(ERROR_PATH)
    public String getErrorPage(WebRequest webReq) {
        Map<String, Object> errorMap = this.errorAttributes.getErrorAttributes(webReq, true);

        return "An error has occurred. See details here: " +
                errorMap.get("timestamp").toString() + "\n" +
                errorMap.get("error") + "\n" +
                errorMap.get("message") + "\n" +
                errorMap.get("path") + "\n" +
                errorMap.get("status");
    }
}
