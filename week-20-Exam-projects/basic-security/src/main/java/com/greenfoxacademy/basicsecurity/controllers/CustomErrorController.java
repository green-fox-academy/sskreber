package com.greenfoxacademy.basicsecurity.controllers;

import com.greenfoxacademy.basicsecurity.models.ApiError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;
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
    public ApiError getErrorPage(WebRequest webReq, Throwable ex) {
        Map<String, Object> errorMap = this.errorAttributes.getErrorAttributes(webReq, true);

        // METHOD 1: simply returning a concatenated String:

//        return "An error has occurred. See details here: " +
//                errorMap.get("timestamp").toString() + "\n" +
//                errorMap.get("error") + "\n" +
//                errorMap.get("message") + "\n" +
//                errorMap.get("path") + "\n" +
//                errorMap.get("status");

        // METHOD 2: returning a custom class made up of selected error attributes (see ApiError in models):

        ApiError apiError = new ApiError(
                errorMap.get("error").toString(),
                errorMap.get("message").toString(),
                errorMap.get("path").toString(),
                errorMap.get("status").toString());
        apiError.setTimestamp((Date) errorMap.get("timestamp"));

        return apiError;
    }
}
