package com.greenfoxacademy.connectwithmysql.controller;

import com.greenfoxacademy.connectwithmysql.model.Assignee;
import com.greenfoxacademy.connectwithmysql.model.Todo;
import com.greenfoxacademy.connectwithmysql.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

  @GetMapping(value="/addassignee")
  public String addTask() {
    return "addassignee";
  }

  @PostMapping(value="/addassignee")
  public String postTask(@ModelAttribute(name="name") String name, @ModelAttribute(name="email")
                         String email) {
    assigneeRepository.save(new Assignee(name, email));
    return "redirect:/todo/assignee";
  }

  @GetMapping(value="/{id}/deleteassignee")
  public String delete(@PathVariable(name="id") long id) {
    assigneeRepository.deleteById(id);
    return "redirect:/todo/assignee";
  }
}
