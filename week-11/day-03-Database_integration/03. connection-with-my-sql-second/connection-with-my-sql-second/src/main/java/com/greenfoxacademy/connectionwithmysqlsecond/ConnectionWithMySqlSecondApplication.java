package com.greenfoxacademy.connectionwithmysqlsecond;

import com.greenfoxacademy.connectionwithmysqlsecond.models.Todo;
import com.greenfoxacademy.connectionwithmysqlsecond.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionWithMySqlSecondApplication implements CommandLineRunner {

    @Autowired
    private TodoRepository todoRepository;

    public static void main(String[] args) {
        SpringApplication.run(ConnectionWithMySqlSecondApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("Start the day", true, true, "NameA", "anEmailAddress"));
        todoRepository.save(new Todo("Finish H2 workshop1", true, true, "NameB", "anEmailAddress"));
        todoRepository.save(new Todo("Finish JPA workshop2", true, true, "NameC", "anEmailAddress"));
        todoRepository.save(new Todo("Create a CRUD project", true, true, "NameD", "anEmailAddress"));
        todoRepository.save(new Todo("Learn Object Relational Mapping", true, false, "NameE", "anEmailAddress"));
        todoRepository.save(new Todo("Play with MySQL database", true, false, "NameF", "anEmailAddress"));
        todoRepository.save(new Todo("Lose temper", false, true, "NameG", "anEmailAddress"));
        todoRepository.save(new Todo("Finally chill a bit", false, false));
    }
}
