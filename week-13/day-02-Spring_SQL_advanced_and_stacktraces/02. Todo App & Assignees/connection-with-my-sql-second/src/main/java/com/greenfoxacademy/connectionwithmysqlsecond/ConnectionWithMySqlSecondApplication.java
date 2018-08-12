package com.greenfoxacademy.connectionwithmysqlsecond;

import com.greenfoxacademy.connectionwithmysqlsecond.models.Assignee;
import com.greenfoxacademy.connectionwithmysqlsecond.models.Todo;
import com.greenfoxacademy.connectionwithmysqlsecond.repositories.AssigneeRepository;
import com.greenfoxacademy.connectionwithmysqlsecond.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionWithMySqlSecondApplication implements CommandLineRunner {

    private TodoRepository todoRepository;
    private AssigneeRepository assigneeRepository;

    @Autowired
    public void setTodoRepository(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Autowired
    public void setAssigneeRepository(AssigneeRepository assigneeRepository) {
        this.assigneeRepository = assigneeRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConnectionWithMySqlSecondApplication.class, args);
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

        assigneeRepository.save(new Assignee("Eddie Izzard", "izzarde@gmail.com"));
        assigneeRepository.save(new Assignee("Yours truly", "zsu.karap.coding@gmail.com"));
        assigneeRepository.save(new Assignee("Scar", "theblacklioninthefamily@gmail.com"));
        assigneeRepository.save(new Assignee("Voldemort", "ledarkwizard@gmail.com"));
    }
}
