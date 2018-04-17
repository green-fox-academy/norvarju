package com.greenfoxacademy.restbackend.model;

public class Until {

  private int until;
  private int result;
  private String error;

  public Until(int until) {
    this.until = until;
  }

  public Until() {
  }

  public int getUntil() {
    return until;
  }

  public void setUntil(int until) {
    this.until = until;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public void sum() {
    this.result = until*(until+1)/2;
  }

  public void factor() {
    int factor = 1;
    for (int i = 1; i <= until ; i++) {
      factor *= i;
    }
    this.result = factor;
  }
}
