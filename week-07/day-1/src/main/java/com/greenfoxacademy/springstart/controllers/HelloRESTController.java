package com.greenfoxacademy.springstart.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloRESTController {

  @RequestMapping("/greeting")
  public Greeting greeting(){
    Greeting newGreeting = new Greeting(1, "Hello World");
    return newGreeting;
  }
  
}
