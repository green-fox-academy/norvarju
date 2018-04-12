package com.greenfoxacademy.connectwithmysql.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Component
public class Assignee {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String name;
  private String email;

  @OneToMany
  private List<Todo> todoList;

  public Assignee(String name, String email) {
    this.name = name;
    this.email = email;
    this.todoList = new ArrayList<>();
  }

  public Assignee() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<Todo> getTodoList() {
    return todoList;
  }

  public void setTodoList(List<Todo> todoList) {
    this.todoList = todoList;
  }
}
