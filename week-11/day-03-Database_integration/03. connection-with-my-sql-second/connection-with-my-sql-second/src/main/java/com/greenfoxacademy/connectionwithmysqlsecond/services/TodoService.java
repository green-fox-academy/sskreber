package com.greenfoxacademy.connectionwithmysqlsecond.services;

import com.greenfoxacademy.connectionwithmysqlsecond.models.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public interface TodoService {

    public Optional<Todo> getTodoById(long id);

    public List<Todo> getAllTodo();

    public List<Todo> getAllActiveTodo();

    public List<Todo> getAllTodoByFinishedness(boolean isActive);

    public void saveTodo(Todo todo);

    public void deleteTodoById(long id);
}
