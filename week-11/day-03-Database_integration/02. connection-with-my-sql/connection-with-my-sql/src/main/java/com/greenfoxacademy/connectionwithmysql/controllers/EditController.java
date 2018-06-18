package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;

public class EditController {

    private final TodoRepository todoRepository;

    @Autowired
    public EditController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable(value = "id") long id) {
        return "redirect:/edit/" + id;
    }
//
//    @PostMapping("edit/{id}")
//    public String increaseBalanceOfAccount(@PathVariable(value = "id") long id, @ModelAttribute(value = "title") String title,
//                                           @ModelAttribute(value = "isUrgent") boolean isUrgent,
//                                           @ModelAttribute(value = "isDone") boolean isDone) {
//        Todo inbound = new Todo(title, isUrgent, isDone, LocalDate.now());
//        Todo existing = todoRepository.findById(id);
//        if(existing != null) inbound.setId(existing.getId());
//        userRepository.save(inbound);
//        return "redirect:/edit/" + id;
//    }
}
