package com.greenfoxacademy.connectionwithmysqlsecond.controllers;

import com.greenfoxacademy.connectionwithmysqlsecond.models.Todo;
import com.greenfoxacademy.connectionwithmysqlsecond.services.AssigneeService;
import com.greenfoxacademy.connectionwithmysqlsecond.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoRestController {

    private TodoService todoService;
    private AssigneeService assigneeService;

    @Autowired
    public TodoRestController(TodoService todoService, AssigneeService assigneeService) {
        this.todoService = todoService;
        this.assigneeService = assigneeService;
    }

    @GetMapping(value = "/jsonlist")
    public List<Todo> listTodos() {
        return todoService.getAllTodo();
    }
}
