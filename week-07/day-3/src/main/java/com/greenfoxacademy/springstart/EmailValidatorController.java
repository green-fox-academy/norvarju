package com.greenfoxacademy.springstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailValidatorController {

  @Autowired
  UtilityService utilityService;

  @RequestMapping(value="/useful/email")
  public String isEmailValid(Model model, @RequestParam("email") String email){
    model.addAttribute("validityChecker", utilityService.validateEmail(email));
    model.addAttribute("address", email);
    return "index3";
  }

}
