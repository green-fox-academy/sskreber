package com.greenfoxacademy.listingtodoswithh2.controllers;

import com.greenfoxacademy.listingtodoswithh2.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

    private final TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("todo")
    @ResponseBody
    public String list(Model model) {
        return "This is my first todo";
    }

}
