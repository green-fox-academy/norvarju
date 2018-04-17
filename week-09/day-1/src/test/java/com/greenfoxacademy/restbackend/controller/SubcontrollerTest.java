package com.greenfoxacademy.restbackend.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SubcontrollerTest {

  @Autowired
  MockMvc mockMvc;

  @Test
  public void DoublingTest() throws Exception{
    mockMvc.perform(get("/doubling").param("input", "10"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.result").value(20));
  }

  @Test
  public void DoublingTestErrorMessage() throws Exception {
    mockMvc.perform(get("/doubling").param("input", ""))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error").value("Please provide an input!"));
  }

  @Test
  public void GreeterTest() throws Exception{
    mockMvc.perform(get("/greeter")
            .param("name", "Petike")
            .param("title", "student"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.welcome_message").value("Oh, hi there Petike, my dear " +
                    "student!"));
  }


}