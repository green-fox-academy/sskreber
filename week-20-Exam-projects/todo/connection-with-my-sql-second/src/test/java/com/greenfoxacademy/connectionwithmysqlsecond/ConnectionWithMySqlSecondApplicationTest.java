//package com.greenfoxacademy.connectionwithmysqlsecond;
//
//import com.greenfoxacademy.connectionwithmysqlsecond.models.Todo;
//import com.greenfoxacademy.connectionwithmysqlsecond.repositories.AssigneeRepository;
//import com.greenfoxacademy.connectionwithmysqlsecond.repositories.TodoRepository;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.security.servlet.SpringBootWebSecurityConfiguration;
//import org.springframework.boot.autoconfigure.security.servlet.WebSecurityEnablerConfiguration;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.context.TestConfiguration;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//
//import javax.transaction.Transactional;
//
//import static org.hamcrest.core.Is.is;
//import static org.junit.Assert.assertThat;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
//@ContextConfiguration(classes = ConnectionWithMySqlSecondApplication.class)
//@SpringBootTest
//public class ConnectionWithMySqlSecondApplicationTest {
//
//    @Autowired
//    private TodoRepository todoRepository;
//    @Autowired
//    private AssigneeRepository assigneeRepository;
//
//    @Test
//    @Transactional
//    public void shouldReturnAssigneeNameForTodo() {
//        Todo todo = todoRepository.findTodoByTitle("Finally chill a bit");
//        assertThat(todo.getAssignee().getName(), is("Yours truly"));
//    }
//}
