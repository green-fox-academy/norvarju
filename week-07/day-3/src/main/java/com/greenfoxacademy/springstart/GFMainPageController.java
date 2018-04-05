package com.greenfoxacademy.springstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GFMainPageController {

  @Autowired
  StudentService studentService;

  @RequestMapping(value = "/gfa", method = RequestMethod.GET)
  public String linksToPages(Model model){
    model.addAttribute("students", studentService.findAll());
    return "index5";
  }
}
