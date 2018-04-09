package com.greenfoxacademy.springstart.Controller;

import com.greenfoxacademy.springstart.Database.FoxDB;
import com.greenfoxacademy.springstart.Database.UserDB;
import com.greenfoxacademy.springstart.Model.Fox;
import com.greenfoxacademy.springstart.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class FoxController {

  @Autowired
  UserDB userDB;

  @Autowired
  FoxDB foxDB;

  @Autowired
  MainController mainController;

  @GetMapping("/nutrition")
  public String changeFood(@RequestParam(name = "name", required = false) String username, Model
          model) {
    model.addAttribute("user", userDB.findUser(username));
    model.addAttribute("fox", foxDB.findFox(userDB.findUser(username).getMyFox()));
    return "nutrition";
  }

  @PostMapping("/nutrition")
  public String changeFoodAndDrink(@RequestParam(name = "name", required = false) String username,
                           @ModelAttribute(name = "drink") String drink,
                           @ModelAttribute(name = "food") String food,
                           Model model) {
    model.addAttribute("user", userDB.findUser(username));
    Fox fox = foxDB.findFox(userDB.findUser(username).getMyFox());

    if(drink != null) {
      fox.setDrink(drink);
    }
    if(food != null) {
      fox.setFood(food);
    }
    return "redirect:/?name=" + username;
  }

  @GetMapping("/trickcenter")
  public String trickCenterInfo(@RequestParam(name = "name", required = false) String username,
                                Model model) {
    model.addAttribute("user", userDB.findUser(username));
    model.addAttribute("fox", foxDB.findFox(userDB.findUser(username).getMyFox()));
    return "trickcenter";
  }

  @PostMapping("/trickcenter")
  public String trickCenterInfo(@RequestParam(name = "name", required = false) String username,
                                @ModelAttribute(name = "tricks") String tricks, Model model) {

    model.addAttribute("user", userDB.findUser(username));
    model.addAttribute("fox", foxDB.findFox(userDB.findUser(username).getMyFox()));
    Fox fox = foxDB.findFox(userDB.findUser(username).getMyFox());
    if(tricks != null && !fox.isTrickLearntYet(tricks)) {
      fox.addTrick(tricks);
    } else {
      return "trickWarning";
    }
    return "redirect:/?name=" + username;
  }

}
