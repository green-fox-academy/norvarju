package com.greenfoxacademy.springstart.com.greenfoxacademy.springstart.controller;

import com.greenfoxacademy.springstart.com.greenfoxacademy.springstart.model.BankAccount;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowController {

  @RequestMapping("/show")
  public BankAccount show(){
    BankAccount newBank = new BankAccount("Simba", 2000, "lion");
    return newBank;
  }
}
