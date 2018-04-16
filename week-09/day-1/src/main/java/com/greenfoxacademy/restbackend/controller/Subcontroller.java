package com.greenfoxacademy.restbackend.controller;

import com.greenfoxacademy.restbackend.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Subcontroller {

  @GetMapping("/doubling")
  public Object getDoubledResult(@RequestParam(name="input", required = false) Integer input) {
    if(input == null) {
      return new Fail();
    } else {
      return new Doubling(input);
    }
  }

  @GetMapping("/greeter")
  public Object getGreeting(@RequestParam(name="name", required = false) String name,
                            @RequestParam(name="title", required = false) String title) {
    if(name == null) {
      return new FailGreeter();
    } else if(title == null) {
      return new FailGreeterNoTitle();
    } else {
      Greeter greeter = new Greeter(name, title);
      return new Welcome(greeter);
    }
  }
}
