package com.greenfoxacademy.connectionwithmysqlsecond.services;

import com.greenfoxacademy.connectionwithmysqlsecond.models.Assignee;

import java.util.List;
import java.util.Optional;

public interface AssigneeService {

    List<Assignee> getAllAssignees();
    Optional<Assignee> getAssigneeById(Long id);
    void updateAssignee(Assignee assignee);
    void deleteAssignee(Long id);
    void save(Assignee assignee);
}
