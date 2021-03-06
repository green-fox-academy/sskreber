package com.greenfoxacademy.connectionwithmysql.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;


@Entity
@Table(name = "todos")
public class Todo {

    @Id
    @GeneratedValue
    private long id;

    private String title;
    private Boolean isUrgent;
    private Boolean isDone;
    private LocalDate dateOfCreation;

    public Todo() {
    }

    public Todo(String title, Boolean urgent, Boolean done) {
        this.title = title;
        this.isUrgent = urgent;
        this.isDone = done;
        this.dateOfCreation = LocalDate.now();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
}

