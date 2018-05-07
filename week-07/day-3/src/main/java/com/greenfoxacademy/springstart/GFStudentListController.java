package com.greenfoxacademy.springstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GFStudentListController {

  @Autowired
  StudentService studentService;

  @RequestMapping(value="/gfa/list")
  public String listStudents(Model model){
    model.addAttribute("students", studentService.findAll());
    return "index6";
  }
}
