package com.greenfoxacademy.restbackend.model;

public class FailUntil {

  private String error;

  public FailUntil(String error) {
    this.error = error;
  }

  public FailUntil() {
    error = "Please provide a number!";
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
