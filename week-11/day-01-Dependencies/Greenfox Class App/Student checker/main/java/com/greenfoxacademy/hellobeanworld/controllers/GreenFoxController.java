package com.greenfoxacademy.hellobeanworld.controllers;

import com.greenfoxacademy.hellobeanworld.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreenFoxController {

    private final StudentService studentService;

    @Autowired
    public GreenFoxController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("gfa")
    public String getStudentsMainPage(Model studentMainPageModel) {
        studentMainPageModel.addAttribute("studentCount", StudentService.getStudentCount());
        return "gfa";
    }

    @GetMapping("gfa/list")
    public String getStudentsListPage(Model studentModel) {
        studentModel.addAttribute("studentList", studentService.findAll());
        return "list";
    }

    @GetMapping("gfa/add")
    public String promptStudentDetailsPage() {
        return "add";
    }

    @PostMapping("gfa/save")
    public String addStudentToList(@RequestParam("name") String name) {
        studentService.save(name);
        return "redirect:/gfa/list";
    }

    @GetMapping("gfa/check")
    public String promptStudentCheckNamePage() {
        return "check";
    }

    @PostMapping("gfa/checkifstudentenrolled")
    public String checkIfStudentEnrolled(Model checkNameModel, @RequestParam(value = "checkname",
            required = false, defaultValue = "Please enter a name") String checkName) {
        checkNameModel.addAttribute("isEnrolledString", studentService.checkIfStudentEnrolled(checkName));
        return "check";
    }
//     return "redirect:/gfa/check?username=" + checkName;
}
