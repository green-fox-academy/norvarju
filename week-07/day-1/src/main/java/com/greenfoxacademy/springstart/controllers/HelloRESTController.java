package com.greenfoxacademy.springstart.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;


@RestController
public class HelloRESTController {

  /*@RequestMapping("/greeting")
  public Greeting greeting(){
    Greeting newGreeting = new Greeting(1, "Hello World");
    return newGreeting;
  }*/

  /*@RequestMapping("/greeting")
  public Greeting greeting2(@RequestParam("name") String myName){
  Greeting newGreeting = new Greeting(1, "Hello, " + myName + "!");
    return newGreeting;
  }*/

  @RequestMapping("/greeting")
  public Greeting greeting2(@RequestParam("name") String myName){
    Greeting newGreeting = new Greeting(Greeting.getNumber(),"Hello, " + myName + "!");
    return newGreeting;
  }
}
