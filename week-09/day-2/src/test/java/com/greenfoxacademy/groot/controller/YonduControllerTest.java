package com.greenfoxacademy.groot.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.nio.charset.Charset;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
@EnableWebMvc
public class YonduControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void YonduCalculation() throws Exception {
    mockMvc.perform(get("/yondu")
            .param("distance", "100.0")
            .param("time", "10.0"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.speed").value(10.0));
  }

  @Test
  public void YonduErrorTestNoTime() throws Exception {
    mockMvc.perform(get("/yondu")
            .param("distance", "100.0"))
            .andExpect(status().is4xxClientError());
  }

  @Test
  public void YonduErrorTestNoDistance() throws Exception {
    mockMvc.perform(get("/yondu")
            .param("time", "10.0"))
            .andExpect(status().is4xxClientError());
  }
}