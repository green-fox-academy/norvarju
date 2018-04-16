package com.greenfoxacademy.restbackend.model;

public class Fail {

  private String error;

  public Fail(String error) {
    this.error = error;
  }

  public Fail() {
    error = "Please provide an input!";
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
