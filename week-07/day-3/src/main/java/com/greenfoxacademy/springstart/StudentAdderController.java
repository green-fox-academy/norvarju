package com.greenfoxacademy.springstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentAdderController {

  @Autowired
  StudentService studentService;

  @RequestMapping(value="/add", method = RequestMethod.GET)
  public String add() {
    return "index7";
  }

  @RequestMapping(value="/add", method = RequestMethod.POST)
  public String add(@ModelAttribute(name = "student") String student, Model model) {
    studentService.save(student);
    return "redirect:/gfa/list";
  }
}
