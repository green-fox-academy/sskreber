package com.greenfoxacademy.connectionwithmysqlsecond.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "todos")
public class Todo {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private Boolean isUrgent;
    private Boolean isDone;
    private LocalDate dateOfCreation;
    private LocalDate dateOfModification;

    @OneToOne
    @JoinColumn(name = "assignee_email")
    private Assignee assignee;

    public Todo() {
    }

    public Todo(String title, Boolean isUrgent, Boolean isDone) {
        this.title = title;
        this.isUrgent = isUrgent;
        this.isDone = isDone;
        this.dateOfCreation = LocalDate.now();
        this.dateOfModification = LocalDate.now();
        this.assignee = new Assignee();
    }

    public Todo(String title, Boolean isUrgent, Boolean isDone, String assaigneeName, String assaigneeEmail) {
        this.title = title;
        this.isUrgent = isUrgent;
        this.isDone = isDone;
        this.dateOfCreation = LocalDate.now();
        this.dateOfModification = LocalDate.now();
        this.assignee = new Assignee(assaigneeName, assaigneeEmail);
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

    public Boolean getUrgent() {
        return isUrgent;
    }

    public void setUrgent(Boolean urgent) {
        isUrgent = urgent;
    }

    public Assignee getAssaignee() {
        return assignee;
    }

    public void setAssignee(String assaigneeName, String assaigneeEmail) {
        this.assignee = new Assignee(assaigneeName, assaigneeEmail);
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
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
        this.dateOfModification = dateOfModification;
    }
}

