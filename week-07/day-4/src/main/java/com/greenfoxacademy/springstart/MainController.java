package com.greenfoxacademy.springstart;

import com.greenfoxacademy.springstart.Database.FoxDB;
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

  @Autowired
  FoxDB foxDB;

  /*@GetMapping("/")
  public String mainPage() {
    return "index";
  }*/

  @GetMapping("/login")
  public String login() {
    return "login";
  }

  @PostMapping("/login")
  public String login(@ModelAttribute(name = "username") String username, Model model) {
    if (userDB.findUser(username) != null) {
      return "redirect:/?name=" + username;
    } else {
      return "loginFailure";
    }
  }

  @GetMapping("/")
  public String showProfile(@RequestParam(name = "name", required = false) String username,
                            Model model) {

    model.addAttribute("name", foxDB.findFox(userDB.findUser(username).getMyFox()).getName());
    model.addAttribute("numberOfTricks", foxDB.findFox(userDB.findUser(username).getMyFox())
            .getListOfString().size());
    model.addAttribute("food", foxDB.findFox(userDB.findUser(username).getMyFox()).getFood());
    model.addAttribute("drink", foxDB.findFox(userDB.findUser(username).getMyFox()).getDrink());
    model.addAttribute("username", userDB.findUser(username).getUserName());
    return "index";
  }


}
