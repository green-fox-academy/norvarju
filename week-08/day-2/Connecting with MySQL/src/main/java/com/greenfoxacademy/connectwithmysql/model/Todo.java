package com.greenfoxacademy.connectwithmysql.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Component
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private boolean urgent;
  private boolean done;

  @ManyToOne
  @JoinColumn(name="assignee_id")
  private Assignee assignee;

  public Todo(String title) {
    this.id = id;
    this.title = title;
    this.urgent = false;
    this.done = false;
    this.assignee = assignee;
  }

  public Todo() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public Assignee getAssignee() {
    return assignee;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  public void setAssignee(Assignee assignee) {
    this.assignee = assignee;
  }

  @Override
  public String toString() {
    return id + ". " + title;
  }
}
