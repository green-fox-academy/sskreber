package com.greenfoxacademy.connectionwithmysqlsecond.services;

import com.greenfoxacademy.connectionwithmysqlsecond.models.Todo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public interface TodoService {

    public List<Todo> findAllTodo();

    public List<Todo> findAllTodoByIsDone(boolean isDone);

    public Todo findTodoById(Long id);

    public Todo findTodoByTitle(String title);

    public Todo findTodoByDateOfCreation(LocalDate dateOfCreation);

    public Todo findTodoByDateOfModification(LocalDate dateOfModification);

    public void deleteTodoById(Long id);

    public void deleteByTitle(String title);

    public void saveTodo(Todo todo);

    public void updateTodo(Todo todoToSave);

}
