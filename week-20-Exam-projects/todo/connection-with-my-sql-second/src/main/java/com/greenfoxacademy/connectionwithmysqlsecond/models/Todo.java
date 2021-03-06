package com.greenfoxacademy.connectionwithmysqlsecond.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "todos")
public class Todo {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String title;
    private Boolean isUrgent;
    private Boolean isDone;
    private LocalDate dateOfCreation;
    private LocalDate dateOfModification;

    @ManyToOne
    @JoinColumn(name = "assignee_id")
    private Assignee assignee;

    public Todo() {
        this.dateOfCreation = LocalDate.now();
    }

    public Todo(String title, Boolean isUrgent, Boolean isDone) {
        this.title = title;
        this.isUrgent = isUrgent;
        this.isDone = isDone;
        this.dateOfCreation = LocalDate.now();
    }

    public Todo(String title, Boolean isUrgent, Boolean isDone, Assignee assignee) {
        this.title = title;
        this.isUrgent = isUrgent;
        this.isDone = isDone;
        this.assignee = assignee;
        this.dateOfCreation = LocalDate.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getIsUrgent() {
        return isUrgent;
    }

    public void setIsUrgent(Boolean urgent) {
        isUrgent = urgent;
    }

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

    public Boolean getIsDone() {
        return isDone;
    }

    public void setIsDone(Boolean done) {
        isDone = done;
    }

    public LocalDate getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(LocalDate dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public LocalDate getDateOfModification() {
        return dateOfModification;
    }

    public void setDateOfModification(LocalDate dateOfModification) {
        this.dateOfModification = LocalDate.now();
    }
}

