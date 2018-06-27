package com.greenfoxacademy.connectionwithmysqlsecond.repositories;

import com.greenfoxacademy.connectionwithmysqlsecond.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

    List<Todo> findTodoByIsDoneFalse();

    List<Todo> findTodoByIsDoneTrue();

    @Override
    <S extends Todo> S save(S entity);

    @Override
    void deleteById(Long aLong);

    @Override
    boolean existsById(Long aLong);

    void deleteTodoByTitle(String title);

    Todo findTodoByTitle(String action);
}

