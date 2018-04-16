package com.greenfoxacademy.restbackend.model;

public class Appended {

  private String appended;

  public Appended(String wordToAppend) {
    this.appended = wordToAppend + "a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
