package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddController {

    private final TodoRepository todoRepository;

    @Autowired
    public AddController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("todo/create")
    public String createTodoPage() {
        return "create";
    }

    @PostMapping("submitnewtodo")
    public String submitTodo(@ModelAttribute(value = "title") String title,
                             @ModelAttribute(value = "isUrgent") boolean isUrgent,
                             @ModelAttribute(value = "isDone") boolean isDone) {
        todoRepository.save(new Todo(title, isUrgent, isDone));
        return "redirect:/todoslist";
    }
}
