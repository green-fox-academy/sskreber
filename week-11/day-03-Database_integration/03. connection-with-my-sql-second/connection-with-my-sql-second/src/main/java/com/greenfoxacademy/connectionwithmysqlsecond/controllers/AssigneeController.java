package com.greenfoxacademy.connectionwithmysqlsecond.controllers;

import com.greenfoxacademy.connectionwithmysqlsecond.services.TodoService;
import org.springframework.stereotype.Controller;

@Controller
public class AssigneeController {
    private TodoService todoService;

    public AssigneeController(TodoService todoService) {
        this.todoService = todoService;
    }

    // TODO: create endpoints mentioned in todoslist.html (editname, deletename, editemail, deleteemail)
}
