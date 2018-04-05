package com.greenfoxacademy.springstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UsefulColoredController {

  @Autowired
  UtilityService utilityService;

  @RequestMapping(value="/useful/colored", method=RequestMethod.GET)
  public String ColoredPage(Model model){
    model.addAttribute("color", utilityService.randomColor());
    return "index2";
  }
}
