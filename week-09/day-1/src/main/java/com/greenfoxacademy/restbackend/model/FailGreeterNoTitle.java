package com.greenfoxacademy.restbackend.model;

public class FailGreeterNoTitle {

  private String error;

  public FailGreeterNoTitle(String error) {
    this.error = error;
  }

  public FailGreeterNoTitle() {
    error = "Please provide a title!";
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
