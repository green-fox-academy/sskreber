package com.greenfoxacademy.arrow.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(ArrowPathController.class)
public class YondusArrowPathControllerTest {

    @Autowired
    private MockMvc mockMvc;

    // We'd have this IF we had a service in the application:
//    @MockBean
//    private ArrowPathService arrowPathService;

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    @Test
    public void getSpeedUsingCorrectParameters() throws Exception {
        MultiValueMap<String, String> requestParams = new LinkedMultiValueMap<>();
        requestParams.add("distance", "100.0");
        requestParams.add("time", "10.0");

        mockMvc.perform(get("/yondu")
                .contentType(contentType)
                .params(requestParams))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.distance", is(100.0)))
                .andExpect(jsonPath("$.time", is(10.0)))
                .andExpect(jsonPath("$.speed", is(10.0)));
    }

    @Test
    public void getSpeedHandlingDivisionByZero() throws Exception {
        MultiValueMap<String, String> requestParams = new LinkedMultiValueMap<>();
        requestParams.add("distance", "100.0");
        requestParams.add("time", "0.0");

        mockMvc.perform(get("/yondu")
                .contentType(contentType)
                .params(requestParams))
                .andExpect(status().isBadRequest())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("Can't divide by zero. Maybe another time.")));
    }

    @Test
    public void getSpeedUsingNoParameters() throws Exception {
        MultiValueMap<String, String> requestParams = new LinkedMultiValueMap<>();
        requestParams.add("distance", null);
        requestParams.add("time", null);

        mockMvc.perform(get("/yondu")
                .contentType(contentType)
                .params(requestParams))
                .andExpect(status().isBadRequest())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.error", is("No input given. Please enter distance and time.")));
    }
}
