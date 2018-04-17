package com.greenfoxacademy.groot.model;

public class Guardian {

  private String received;
  private String translated;

  public Guardian(String received, String translated) {
    this.received = received;
    this.translated = translated;
  }

  public Guardian() {
    this.translated = "I am groot";
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public String getTranslated() {
    return translated;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }
}
