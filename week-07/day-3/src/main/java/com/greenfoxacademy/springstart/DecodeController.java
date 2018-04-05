package com.greenfoxacademy.springstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DecodeController {

  @Autowired
  UtilityService utilityService;

  @RequestMapping(value="useful/decode", method= RequestMethod.GET)
  public String encode(Model model, @RequestParam("text") String text, @RequestParam("number")
          int number){
    model.addAttribute("textToEncode", utilityService.caesarDecode(text, number));
    return "index4";
  }
}