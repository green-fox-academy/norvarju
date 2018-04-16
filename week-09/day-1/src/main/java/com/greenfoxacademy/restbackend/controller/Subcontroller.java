package com.greenfoxacademy.restbackend.controller;

import com.greenfoxacademy.restbackend.model.Doubling;
import com.greenfoxacademy.restbackend.model.Fail;
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
}
