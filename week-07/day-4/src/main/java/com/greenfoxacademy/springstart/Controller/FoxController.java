package com.greenfoxacademy.springstart.Controller;

import com.greenfoxacademy.springstart.Database.FoxDB;
import com.greenfoxacademy.springstart.Database.UserDB;
import com.greenfoxacademy.springstart.Model.Fox;
import com.greenfoxacademy.springstart.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FoxController {

  @Autowired
  UserDB userDB;

  @Autowired
  FoxDB foxDB;

  @Autowired
  MainController mainController;

  @GetMapping("/{nutrition}")
  public String changeFood(@PathVariable(name = "nutrition") String nutrition) {
    return "nutrition";
  }

  @PostMapping("/{nutrition}")
  public String changeFood(@PathVariable(name = "nutrition") String nutrition,
                           @RequestParam(name = "name", required = false) String username,
                           @ModelAttribute(name = "drink") String drink,
                           @ModelAttribute(name = "food") String food,
                           Model model) {
    User user = userDB.findUser(username);
    /*Fox fox = foxDB.findFox(user.getMyFox());

    if(drink != null) {
      fox.setDrink(drink);
    }
    if(food != null) {
      fox.setFood(food);
    }*/
    return "redirect:/nutrition?name=" + username;
  }

}
