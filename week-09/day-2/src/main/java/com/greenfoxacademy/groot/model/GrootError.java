package com.greenfoxacademy.groot.model;

public class GrootError {

  private String error;

  public GrootError(String error) {
    this.error = error;
  }

  public GrootError() {
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
