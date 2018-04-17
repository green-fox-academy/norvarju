package com.greenfoxacademy.restbackend.controller;

import com.greenfoxacademy.restbackend.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Subcontroller {

  @GetMapping("/doubling")
  public Object getDoubledResult(@RequestParam(name = "input", required = false) Integer input) {
    if(input == null) {
      return new Fail();
    } else {
      return new Doubling(input);
    }
  }

  @GetMapping("/greeter")
  public Object getGreeting(@RequestParam(name = "name", required = false) String name,
                            @RequestParam(name = "title", required = false) String title) {
    if(name == null) {
      return new FailGreeter();
    } else if(title == null) {
      return new FailGreeterNoTitle();
    } else {
      Greeter greeter = new Greeter(name, title);
      return new Welcome(greeter);
    }
  }

  @GetMapping("/appenda/{appendable}")
  public Object getAppended(@PathVariable(name = "appendable", required = false) String
                                      appendable) {
    return new Appended(appendable);
  }

  @PostMapping("/dountil/{what}")
  public Object getNumbersUntil(@PathVariable(name = "what") String what, @RequestBody Until
          until) {
    if(until == null) {
      return new FailUntil();
    } else if(what.equals("sum")) {
      until.sum();
    } else if(what.equals("factor")) {
      until.factor();
    }
    return until;
  }
}
