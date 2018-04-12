package com.greenfoxacademy.connectwithmysql.controller;

import com.greenfoxacademy.connectwithmysql.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class AssigneeController {

  @Autowired
  AssigneeRepository assigneeRepository;

  @GetMapping("/assignee")
  public String assigneeList(Model model) {
    model.addAttribute("assignees", assigneeRepository.findAll());
    return "assignees";
  }
}
