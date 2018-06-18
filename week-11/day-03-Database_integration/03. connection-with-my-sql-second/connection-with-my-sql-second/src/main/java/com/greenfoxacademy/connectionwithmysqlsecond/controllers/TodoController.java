package com.greenfoxacademy.connectionwithmysqlsecond.controllers;

import com.greenfoxacademy.connectionwithmysqlsecond.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

 private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping(value = "/list")
    public String list(Model model) {
        model.addAttribute("todos", todoService.getAllTodo());
        return "todoslist";
    }

    @RequestMapping(value = "/todo")
    public String listActive(@RequestParam("isActive") boolean isActive, Model model)  {
        model.addAttribute("todos", todoService.getAllTodoByFinishedness(isActive));
        return "todoslist";
    }
}
