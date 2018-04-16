package com.greenfoxacademy.restbackend.model;

import org.springframework.beans.factory.annotation.Autowired;

public class FailGreeter {

  @Autowired
  Greeter greeter;

  private String error;

  public FailGreeter(String error) {
    this.error = error;
  }

  public FailGreeter() {
    error = "Please provide a name!";
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
