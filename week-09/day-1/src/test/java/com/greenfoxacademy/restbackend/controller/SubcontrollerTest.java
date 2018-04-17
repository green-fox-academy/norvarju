package com.greenfoxacademy.restbackend.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import java.nio.charset.Charset;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SubcontrollerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

  @Autowired
  MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void DoublingTest() throws Exception{
    mockMvc.perform(get("/doubling").param("input", "10"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.result").value(20));
  }

  @Test
  public void DoublingTestErrorMessage() throws Exception {
    mockMvc.perform(get("/doubling"))
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

  @Test
  public void GreeterTestNoName() throws Exception{
    mockMvc.perform(get("/greeter")
            .param("title",  "student"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error").value("Please provide a name!"));
  }

  @Test
  public void GreeterTestNoTitle() throws Exception{
    mockMvc.perform(get("/greeter")
            .param("name",  "Petike"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error").value("Please provide a title!"));
  }
}