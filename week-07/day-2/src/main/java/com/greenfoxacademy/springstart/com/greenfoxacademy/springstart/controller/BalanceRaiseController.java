package com.greenfoxacademy.springstart.com.greenfoxacademy.springstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BalanceRaiseController {

  @GetMapping("/increase")
  public String raiseBalance(Model model){
    return "index3";
  }
}
