package com.greenfoxacademy.iamgroot.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    @Test
    public void getGrootMessageSuccessfully() throws Exception {
        mockMvc.perform(get("/groot")
                .contentType(contentType)
                .param("message", "somemessage"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.received", is("somemessage")))
                .andExpect(jsonPath("$.translated", is("I am Groot!")));
    }

    @Test
    public void getGrootMessageUnsuccessfully() throws Exception {
        mockMvc.perform(get("/groot")
                .contentType(contentType))
                .andExpect(status().isBadRequest())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("I am Groot!")));
    }
}
