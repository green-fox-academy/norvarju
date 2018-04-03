package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreatCounter {

  @RequestMapping ("/web/greeting2")
  public String greatCounterApp(@RequestParam("name") String myName){
    Counter myCounter = new Counter(Counter.getNumber());
    return "Hello, " + myName + "! This site was loaded " + myCounter.getCounter() + " times " +
            "since last server start.";
  }
}
