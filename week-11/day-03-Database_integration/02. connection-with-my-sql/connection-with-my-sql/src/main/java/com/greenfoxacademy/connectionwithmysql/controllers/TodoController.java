package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
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

    @GetMapping(value = {"todo", "todo/list"})
    public String list(Model model) {
        model.addAttribute("todos", todoRepository.findAll());
        return "todoslist";
    }

//    @GetMapping("/todo/{isDone}")
//    public String listUnFinished(@PathVariable(value = "isDone") boolean isDone, Model modelUnFinished) {
//        modelUnFinished.addAttribute("todos", todoRepository.findAll());
//        return "todoslist";
//    }

}
