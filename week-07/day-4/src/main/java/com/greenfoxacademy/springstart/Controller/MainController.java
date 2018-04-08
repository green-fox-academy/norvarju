package com.greenfoxacademy.springstart.Controller;

import com.greenfoxacademy.springstart.Database.FoxDB;
import com.greenfoxacademy.springstart.Database.UserDB;
import com.greenfoxacademy.springstart.Model.Fox;
import com.greenfoxacademy.springstart.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;

@Controller
@Component
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

    User user = userDB.findUser(username);
    Fox fox = foxDB.findFox(user.getMyFox());

    model.addAttribute("name", fox.getName());
    model.addAttribute("numberOfTricks", fox.getListOfTricks().size());
    model.addAttribute("food", fox.getFood());
    model.addAttribute("drink", fox.getDrink());
    model.addAttribute("username", user.getUserName());
    model.addAttribute("listOfTricks", fox.getListOfTricks());
    return "index";
  }


}
