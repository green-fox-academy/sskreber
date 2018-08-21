package com.greenfoxacademy.connectionwithmysqlsecond.controllers;

import com.greenfoxacademy.connectionwithmysqlsecond.models.Todo;
import com.greenfoxacademy.connectionwithmysqlsecond.services.AssigneeService;
import com.greenfoxacademy.connectionwithmysqlsecond.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/jsonlist/{name}")
    public List<Todo> listTodosByAssignee(@PathVariable(value = "name") String name) {
        return todoService.findAllTodoByAssigneeName(name);
    }

    @PostMapping("json/submitnewtodo")
    public Todo submitNewTodoViaPostman(@RequestParam(value = "title") String title,
                              @RequestParam(value = "isUrgent", defaultValue = "false") boolean isUrgent,
                              @RequestParam(value = "isDone", defaultValue = "false") boolean isDone) {
        Todo todo = new Todo(title, isUrgent, isDone);
        todoService.saveTodo(todo);
        return todo;
    }
}
