package com.greenfoxacademy.springstart.com.greenfoxacademy.springstart.controller;

import com.greenfoxacademy.springstart.com.greenfoxacademy.springstart.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetController {

  @RequestMapping("/greetings")
  public String greeting(Model model){
    BankAccount newBank = new BankAccount();
    model.addAttribute("html", "<em>HTML</em>");
    model.addAttribute("enjoy", "<b>Enjoy yourself!</b>");
    return "index2";
  }
}
