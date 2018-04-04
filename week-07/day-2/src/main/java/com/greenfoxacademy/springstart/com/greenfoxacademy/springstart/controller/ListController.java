package com.greenfoxacademy.springstart.com.greenfoxacademy.springstart.controller;

import com.greenfoxacademy.springstart.com.greenfoxacademy.springstart.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ListController {

  @RequestMapping(value ="/list", method = RequestMethod.GET)
  public String listAccounts(Model model){
    BankAccount account1 = new BankAccount("Simba", 2000, "lion");
    BankAccount account2 = new BankAccount("Mufasa", 500, "lion");
    BankAccount account3 = new BankAccount("Timon", 200, "meerkats");
    BankAccount account4 = new BankAccount("Bumba", 100, "warthog");
    BankAccount account5 = new BankAccount("Mufasa", 1500, "lion");
    BankAccount account6 = new BankAccount("Rafiki", 800, "ape");
    List<BankAccount> bank = new ArrayList<>();
    bank.add(account1);
    bank.add(account2);
    bank.add(account3);
    bank.add(account4);
    bank.add(account5);
    bank.add(account6);
    model.addAttribute("accounts", bank);
    return "index2";
  }
}
