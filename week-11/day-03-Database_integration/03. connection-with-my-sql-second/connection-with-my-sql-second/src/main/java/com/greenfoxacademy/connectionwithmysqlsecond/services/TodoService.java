package com.greenfoxacademy.connectionwithmysqlsecond.services;

import com.greenfoxacademy.connectionwithmysqlsecond.models.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public interface TodoService {

    Optional<Todo> getTodoById(long id);

    List<Todo> getAllTodo();

    List<Todo> getAllActiveTodo();

    List<Todo> getAllTodoByFinishedness(boolean isActive);

    void saveTodo(Todo todo);

    void deleteTodoById(long id);

    boolean existsById(long id);

    void deleteTodoByTitle(String title);
}
