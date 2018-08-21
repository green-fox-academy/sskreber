package com.greenfoxacademy.connectionwithmysqlsecond.controllers;

import com.greenfoxacademy.connectionwithmysqlsecond.ConnectionWithMySqlSecondApplication;
import com.greenfoxacademy.connectionwithmysqlsecond.models.Todo;
import com.greenfoxacademy.connectionwithmysqlsecond.repositories.AssigneeRepository;
import com.greenfoxacademy.connectionwithmysqlsecond.repositories.TodoRepository;
import com.greenfoxacademy.connectionwithmysqlsecond.services.AssigneeService;
import com.greenfoxacademy.connectionwithmysqlsecond.services.TodoService;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.web.JsonPath;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(value = TodoRestController.class, secure = false)
public class TodoRestControllerGetTest {

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

    private List<Todo> mockTodos;
    private MvcResult result;
    private static final int TARGET_JASON_OBJECT_INDEX = 0;
    private JSONArray receivedJsonArray;
    private JSONObject receivedJsonObject;

    @Before
    public void setupRequest() {

        mockTodos = new ArrayList<>(Arrays.asList(new Todo("This is a mock Todo", true, false)));

        Mockito.when(
                todoService.getAllTodo()).thenReturn(mockTodos);

        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/jsonlist")
                .accept(MediaType.APPLICATION_JSON);
        try {
            result = mockMvc.perform(requestBuilder).andReturn();
        } catch (Exception ex) {
            System.out.println("Problem performing request");
        }

        extractTargetResponseJsonObject();
    }


    public void extractTargetResponseJsonObject() {
        try {
            receivedJsonArray = new JSONArray(result.getResponse().getContentAsString());
            receivedJsonObject = new JSONObject(receivedJsonArray.getString(TARGET_JASON_OBJECT_INDEX));
        } catch(UnsupportedEncodingException e) {
            System.out.println("Error parsing json");
        } catch (JSONException e) {
            System.out.println("Error receiving json");
        }
    }

    @After
    public void after() {
        mockTodos = null;
        result = null;
        receivedJsonArray = null;
        receivedJsonObject = null;
    }

    @Test
    public void listTodosCheckOKStatusCode() throws Exception {

        System.out.println("result.getResponse.getString: " + result.getResponse().getContentAsString());

        int expectedStatus = 200;
        assertEquals(expectedStatus, result.getResponse().getStatus());
    }

    @Test
    public void listTodosCheckReceivedTodoTitleField() throws Exception {
        String expectedTodoTitle = "This is a mock Todo";
        String receivedTodoTitle = receivedJsonObject.getString("title");

        assertEquals(expectedTodoTitle, receivedTodoTitle);
    }

    @Test
    public void listTodosCheckReceivedTodoIsUrgentField() throws Exception {
        boolean receivedTodoIsUrgent= receivedJsonObject.getBoolean("isUrgent");
        assertTrue(receivedTodoIsUrgent);
    }

    @Test
    public void listTodosCheckReceivedTodoIsDoneField() throws Exception {
        boolean receivedTodoIsDone= receivedJsonObject.getBoolean("isDone");
        assertFalse(receivedTodoIsDone);
    }
}
