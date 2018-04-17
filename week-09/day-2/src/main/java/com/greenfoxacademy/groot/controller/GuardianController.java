package com.greenfoxacademy.groot.controller;

import com.greenfoxacademy.groot.model.GrootError;
import com.greenfoxacademy.groot.model.Guardian;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @GetMapping("/groot")
  public Object translateGroot(@RequestParam(name = "message") String message, @RequestBody
          (required = false) Guardian guardian) {
    if (message == null) {
      return new GrootError();
    } else {
      guardian = new Guardian();
      guardian.setReceived(message);
      return guardian;
    }
  }
}
