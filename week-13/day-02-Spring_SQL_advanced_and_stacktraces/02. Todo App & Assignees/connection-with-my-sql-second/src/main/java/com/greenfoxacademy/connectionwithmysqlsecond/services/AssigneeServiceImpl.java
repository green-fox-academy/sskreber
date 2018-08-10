package com.greenfoxacademy.connectionwithmysqlsecond.services;

import com.greenfoxacademy.connectionwithmysqlsecond.models.Assignee;
import com.greenfoxacademy.connectionwithmysqlsecond.repositories.AssigneeRepository;
import com.greenfoxacademy.connectionwithmysqlsecond.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AssigneeServiceImpl implements AssigneeService {

    private AssigneeRepository assigneeRepository;

    private TodoRepository todoRepository;

    @Autowired
    public AssigneeServiceImpl(AssigneeRepository assigneeRepository, TodoRepository todoRepository) {
        this.assigneeRepository = assigneeRepository;
        this.todoRepository = todoRepository;
    }

    @Override
    public List<Assignee> getAllAssignees() {
        return (List<Assignee>)assigneeRepository.findAll();
    }

    @Override
    public Optional<Assignee> getAssigneeById(Long id) {
        return assigneeRepository.findById(id);
    }

    @Override
    public void updateAssignee(Assignee assignee) {
        assigneeRepository.save(assignee);
    }

    @Override
    public void deleteAssignee(Long id) {
        assigneeRepository.deleteById(id);
    }

    @Override
    public void save(Assignee assignee) {
        assigneeRepository.save(assignee);
    }
}
