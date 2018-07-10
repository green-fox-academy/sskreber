package com.greenfoxacademy.arrow.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.greenfoxacademy.arrow.models.*;

@RestController
public class YondusArrowController {

    @GetMapping("/yondu")
    public ResponseEntity<YondusArrowController> getSpeedUsingUserInput(@RequestParam(value = "distance", required = false) Double distance,
    @RequestParam(value = "time", required = false) Double time) {
        if (distance != null && time != null) {
            return new ResponseEntity(new Speed(distance, time), HttpStatus.OK);
        } else {
            return new ResponseEntity(new ErrorMessage("No input given. Please enter distance and time."), HttpStatus.BAD_REQUEST);

        }
    }
}
