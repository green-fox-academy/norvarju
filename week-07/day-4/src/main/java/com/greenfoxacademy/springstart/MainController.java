package com.greenfoxacademy.springstart;

import com.greenfoxacademy.springstart.Model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  @Autowired
  Fox fox;

  @GetMapping("/login")
  public String login(){
    return "login";
  }

  @PostMapping("/login")
  public String login(@ModelAttribute(name = "username") String username, Model model) {
    return "redirect:/";
  }
}
