package com.greenfoxacademy.connectionwithmysqlsecond.repositories;

import com.greenfoxacademy.connectionwithmysqlsecond.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

}

