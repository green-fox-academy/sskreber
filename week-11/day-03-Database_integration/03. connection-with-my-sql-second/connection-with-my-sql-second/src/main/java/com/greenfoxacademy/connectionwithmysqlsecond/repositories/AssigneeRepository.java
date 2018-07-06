package com.greenfoxacademy.connectionwithmysqlsecond.repositories;

import com.greenfoxacademy.connectionwithmysqlsecond.models.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {

}
