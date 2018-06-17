package com.greenfoxacademy.listingtodoswithh2.models;

import com.greenfoxacademy.listingtodoswithh2.repositories.TodoRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Todo {

    @Id
    @GeneratedValue
    private long id;
    private String title;
    private Boolean urgent;
    private Boolean done;
    private LocalDate dateOfCreation;

    public Todo(String title, Boolean urgent, Boolean done) {
        this.title = title;
        this.urgent = urgent;
        this.done = done;
        this.dateOfCreation = LocalDate.now();
    }
}
