package com.greenfoxacademy.connectionwithmysqlsecond.repositories;

import com.greenfoxacademy.connectionwithmysqlsecond.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

    List<Todo> findTodoByIsDoneFalse();

    List<Todo> findTodoByIsDoneTrue();

    void deleteTodoByTitle(String title);

    Todo findTodoByTitle(String action);

    List<Todo> findByTitleContaining(String title);
}

