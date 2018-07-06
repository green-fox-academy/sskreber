package com.greenfoxacademy.connectionwithmysqlsecond.repositories;

import com.greenfoxacademy.connectionwithmysqlsecond.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

    Todo findTodoByTitle(String title);

    Todo findTodoByDateOfCreation(LocalDate dateOfCreation);

    Todo findTodoByDateOfModification(LocalDate dateOfModification);

    List<Todo> findAllTodoByIsDone(boolean isDone);

    void deleteByTitle(String title);
}

