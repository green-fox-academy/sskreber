package com.greenfoxacademy.hellobeanworld.controllers;

import com.greenfoxacademy.hellobeanworld.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreenFoxController {

    private final StudentService studentService;

    @Autowired
    public GreenFoxController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("gfa")
    public String getStudentsMainPage() {
        return "gfa";
    }

    @GetMapping("gfa/list")
    public String getStudentsListPage(Model studentModel) {
        studentModel.addAttribute("studentList", studentService.findAll());
        return "list";
    }
}
