package com.greenfoxacademy.springstart;

import com.greenfoxacademy.springstart.Database.UserDB;
import com.greenfoxacademy.springstart.Model.Fox;
import com.greenfoxacademy.springstart.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;

@Controller
public class MainController {

  @Autowired
  Fox fox;

  @Autowired
  User user;

  @Autowired
  UserDB userDB;

  /*@GetMapping("/")
  public String mainPage() {
    return "index";
  }*/

  @GetMapping("/login")
  public String login() {
    return "login";
  }

  @PostMapping("/login")
  public String login(@RequestParam(name = "username") String username, Model model) {
    if (userDB.)
    return "redirect:/?name=" + username;
  }

  @GetMapping("/{username}")
  public String ShowProfile(@PathVariable(name = "username") String username, Model model) {
    model.addAttribute("name", fox.getName());
    model.addAttribute("numberOfTricks", fox.getListOfString().size());
    model.addAttribute("food", fox.getFood());
    model.addAttribute("drink", fox.getDrink());
    return "index";
  }


}
