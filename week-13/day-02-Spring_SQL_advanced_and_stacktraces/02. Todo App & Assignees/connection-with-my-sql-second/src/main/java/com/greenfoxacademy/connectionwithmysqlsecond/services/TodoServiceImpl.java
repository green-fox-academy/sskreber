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

    public void saveTodo(Todo todo) {
        todoRepository.save(todo);
    }

    @Override
    public void deleteTodoById(long id) {
        todoRepository.deleteById(id);
    }

    public boolean existsById(long id) {
        return todoRepository.existsById(id);
    }

    @Override
    public void deleteTodoByTitle(String title) {
        todoRepository.deleteTodoByTitle(title);
    }

    public Todo getTodoByTitle(String action){
        return todoRepository.findTodoByTitle(action);
    }

    public List<Todo> findTodosByTitleContent(String searchedContent) {
        return todoRepository.findByTitleContaining(searchedContent);
    }

    @Override
    public void updateTodo(Todo todo) {
        todoRepository.save(todo);
    }

    @Override
    public List<Todo> findAllTodoByAssigneeName(String name) {
        return todoRepository.findAllByAssigneeNameIgnoreCase(name);
    }
}
