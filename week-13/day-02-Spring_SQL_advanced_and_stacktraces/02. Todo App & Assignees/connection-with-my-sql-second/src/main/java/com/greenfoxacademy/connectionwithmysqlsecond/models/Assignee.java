package com.greenfoxacademy.connectionwithmysqlsecond.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Assignee {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;

    @OneToMany(mappedBy = "assignee", cascade = CascadeType.ALL)
    List<Todo> todos;

    public Assignee() {
        this.name = "no one";
        this.email = "no email provided";
    }

    public Assignee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
