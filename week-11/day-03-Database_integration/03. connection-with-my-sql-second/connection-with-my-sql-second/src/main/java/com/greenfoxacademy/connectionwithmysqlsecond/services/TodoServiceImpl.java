package com.greenfoxacademy.connectionwithmysqlsecond.services;

import com.greenfoxacademy.connectionwithmysqlsecond.models.Todo;
import com.greenfoxacademy.connectionwithmysqlsecond.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    private TodoRepository todoRepository;

    @Autowired
    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public List<Todo> findAllTodo() {
        return (List<Todo>) todoRepository.findAll();
    }

    @Override
    public List<Todo> findAllTodoByIsDone(boolean isDone) {
        return (List<Todo>) todoRepository.findAllTodoByIsDone(isDone);
    }

    @Override
    public Todo findTodoById(Long id) {
        return todoRepository.findById(id).get();
    }

    @Override
    public Todo findTodoByTitle(String title) {
        return todoRepository.findTodoByTitle(title);
    }

    @Override
    public Todo findTodoByDateOfCreation(LocalDate dateOfCreation) {
        return findTodoByDateOfCreation(dateOfCreation);
    }

    @Override
    public Todo findTodoByDateOfModification(LocalDate dateOfModification) {
        return findTodoByDateOfModification(dateOfModification);
    }

    @Override
    public void deleteTodoById(Long id) {
        todoRepository.deleteById(id);
    }

    @Override
    public void deleteByTitle(String title) {
        todoRepository.deleteByTitle(title);
    }

    @Override
    public void saveTodo(Todo todoToSave) {
        todoRepository.save(todoToSave);
    }

    @Override
    public void updateTodo(Todo todoToSave) {
        todoRepository.save(todoToSave);
    }
}
