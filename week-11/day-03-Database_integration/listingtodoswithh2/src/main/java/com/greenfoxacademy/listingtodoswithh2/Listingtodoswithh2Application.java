package com.greenfoxacademy.listingtodoswithh2;

import com.greenfoxacademy.listingtodoswithh2.models.Todo;
import com.greenfoxacademy.listingtodoswithh2.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Listingtodoswithh2Application implements CommandLineRunner {

    @Autowired
    TodoRepository todoRepository;

    public static void main(String[] args) {
        SpringApplication.run(Listingtodoswithh2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("Start the day", true, true));
        todoRepository.save(new Todo("Finish H2 workshop1", true, true));
        todoRepository.save(new Todo("Finish JPA workshop2", true, true));
        todoRepository.save(new Todo("Create a CRUD project", true, true));
    }
}
