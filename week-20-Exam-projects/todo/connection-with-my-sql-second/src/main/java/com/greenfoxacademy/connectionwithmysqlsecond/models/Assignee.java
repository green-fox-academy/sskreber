package com.greenfoxacademy.connectionwithmysqlsecond.models;

import javax.persistence.*;
import java.util.List;

@Entity(name = "assignees")
public class Assignee {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String name;
    private String email;

    @OneToMany(mappedBy = "assignee", cascade = CascadeType.ALL)
    List<Todo> todos;

    public Assignee() {
        this.name = " ";
        this.email = "no email";
    }

    public Assignee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
