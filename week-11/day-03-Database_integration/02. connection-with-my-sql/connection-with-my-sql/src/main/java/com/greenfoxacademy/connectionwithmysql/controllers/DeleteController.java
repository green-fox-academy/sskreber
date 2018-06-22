package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DeleteController {

    private final TodoRepository todoRepository;

    @Autowired
    public DeleteController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @PostMapping("delete/{id}")
    public String deleteTodo(@PathVariable(value = "id") long id) {
        todoRepository.deleteById(id);
        return "redirect:/list";
    }
}
