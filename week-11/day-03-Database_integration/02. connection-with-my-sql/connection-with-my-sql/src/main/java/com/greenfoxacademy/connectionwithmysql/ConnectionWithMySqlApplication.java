package com.greenfoxacademy.connectionwithmysql;

import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionWithMySqlApplication implements CommandLineRunner {

    @Autowired
    TodoRepository todoRepository;

    public static void main(String[] args) {
        SpringApplication.run(ConnectionWithMySqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("Start the day", true, true));
        todoRepository.save(new Todo("Finish H2 workshop1", true, true));
        todoRepository.save(new Todo("Finish JPA workshop2", true, true));
        todoRepository.save(new Todo("Create a CRUD project", true, true));
        todoRepository.save(new Todo("Learn Object Relational Mapping", true, false));

        todoRepository.save(new Todo("Play with MySQL database", true, false));
        todoRepository.save(new Todo("Lose temper", false, true));
        todoRepository.save(new Todo("Finally chill a bit", false, false));
    }
}
