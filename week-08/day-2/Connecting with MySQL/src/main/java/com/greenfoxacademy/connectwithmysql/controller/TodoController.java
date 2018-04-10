package com.greenfoxacademy.connectwithmysql.controller;

import com.greenfoxacademy.connectwithmysql.model.Todo;
import com.greenfoxacademy.connectwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @Autowired
  Todo todo;

  @GetMapping(value={"/", "/list"})
  public String list(@RequestParam(name="isActive", required = false) boolean isActive, Model
          model) {
    if(isActive != true) {
      model.addAttribute("todos", todoRepository.findByDoneIsFalse());
    } else if(isActive != false) {
      model.addAttribute("todos", todoRepository.findByDoneIsTrue());
    }
    return "todolist";
  }

  @GetMapping(value="/add")
  public String addTask() {
    return "addtask";
  }

  @PostMapping(value="/add")
  public String postTask(@ModelAttribute(name="task") String task) {
    todoRepository.save(new Todo(task));
    return "redirect:/todo/list";
  }

  @GetMapping(value="/{id}/delete")
  public String delete(@PathVariable(name="id") long id) {
    todoRepository.deleteById(id);
    return "redirect:/todo/list";
  }

}