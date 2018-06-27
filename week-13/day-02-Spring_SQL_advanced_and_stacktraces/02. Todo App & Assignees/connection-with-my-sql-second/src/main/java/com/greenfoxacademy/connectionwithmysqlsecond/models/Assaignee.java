package com.greenfoxacademy.connectionwithmysqlsecond.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Assaignee {

    @OneToMany(mappedBy = "assaignee", cascade = CascadeType.ALL)
    List<Todo> todos = new ArrayList<>();

    private String name;
    @Id
    private String email;

    public Assaignee() {
        this.name = "no one";
        this.email = "no email provided";
    }

    public Assaignee(String name, String email) {
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
