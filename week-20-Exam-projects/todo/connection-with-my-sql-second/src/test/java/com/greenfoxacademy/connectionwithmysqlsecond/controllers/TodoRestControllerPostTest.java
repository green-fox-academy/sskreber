package com.greenfoxacademy.connectionwithmysqlsecond.controllers;

import com.greenfoxacademy.connectionwithmysqlsecond.models.Todo;
import com.greenfoxacademy.connectionwithmysqlsecond.repositories.AssigneeRepository;
import com.greenfoxacademy.connectionwithmysqlsecond.repositories.TodoRepository;
import com.greenfoxacademy.connectionwithmysqlsecond.services.AssigneeService;
import com.greenfoxacademy.connectionwithmysqlsecond.services.TodoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.nio.charset.Charset;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(value = TodoRestController.class, secure = false)
public class TodoRestControllerPostTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TodoService todoService;

    @MockBean
    private TodoRepository todoRepository;

    @MockBean
    private AssigneeService assigneeService;

    @MockBean
    private AssigneeRepository assigneeRepository;

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    @Test
    public void submitNewTodoCheck() {

        String expectedTitle = "This is a brand new posted mock Todo";
        boolean expectedIsUrgent = true;
        boolean expectedIsDone = true;

        MultiValueMap<String, String> requestParams = new LinkedMultiValueMap<>();
        requestParams.add("title", expectedTitle);
        requestParams.add("isUrgent", "true");
        requestParams.add("isDone", "true");

        try {
            mockMvc.perform(post("/json/submitnewtodo")
                    .contentType(contentType)
                    .params(requestParams))
                    .andExpect(status().isOk())
                    .andExpect(content().contentType(contentType))
                    .andExpect(jsonPath("$.title", is(expectedTitle)))
                    .andExpect(jsonPath("$.isUrgent", is(expectedIsUrgent)))
                    .andExpect(jsonPath("$.isDone", is(expectedIsDone)));

        } catch (Exception ex) {
            System.out.println("Error executing request");
        }
    }
}
