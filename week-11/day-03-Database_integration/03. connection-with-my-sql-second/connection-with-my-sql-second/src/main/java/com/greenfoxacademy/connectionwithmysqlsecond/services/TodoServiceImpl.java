package com.greenfoxacademy.connectionwithmysqlsecond.services;

import com.greenfoxacademy.connectionwithmysqlsecond.models.Todo;
import com.greenfoxacademy.connectionwithmysqlsecond.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TodoServiceImpl implements TodoService {

    private TodoRepository todoRepository;

    @Autowired
    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public Optional<Todo> getTodoById(long id) {
        return todoRepository.findById(id);
    }

    public List<Todo> getAllTodo() {
        return (ArrayList<Todo>) todoRepository.findAll();
    }

    public List<Todo> getAllActiveTodo() {
        return todoRepository.findTodoByIsDoneFalse();
    }

    public List<Todo> getAllDoneTodo() {
        return todoRepository.findTodoByIsDoneTrue();
    }

    public List<Todo> getAllTodoByFinishedness(boolean isActive) {
        if (isActive) {
            return getAllActiveTodo();
        } else {
            return getAllDoneTodo();
        }
    }
}
