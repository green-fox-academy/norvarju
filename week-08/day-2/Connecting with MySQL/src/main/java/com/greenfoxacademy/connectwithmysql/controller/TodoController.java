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
  public String list(@RequestParam(name="isActive", required = false) String isActive, Model
          model) {
    if(isActive == "true") {
      model.addAttribute("todos", todoRepository.findByDoneIsFalse());
    } else if(isActive == "false") {
      model.addAttribute("todos", todoRepository.findByDoneIsTrue());
    } else {
      model.addAttribute("todos", todoRepository.findAll());
    }
    return "todolist";
  }

  @PostMapping(value={"/", "/list"})
  public String filteredList(@ModelAttribute(name="search") String search, Model model) {
    if(search != null) {
      model.addAttribute("todos", todoRepository.findAllByTitleContainingIgnoreCase(search));
      return "todolist";
    } else {
      return "error";
    }
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

  @GetMapping(value="/{id}/edit")
  public String editTodoList(@PathVariable(name="id") long id, Model model) {
    model.addAttribute("todo", todoRepository.findById(id).get());
    return "editlist";
  }

  @PostMapping(value="/{id}/edit")
  public String editChecker(@ModelAttribute Todo taskToEdit) {
    todoRepository.save(taskToEdit);
    return "redirect:/todo/list";
  }

}