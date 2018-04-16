package com.greenfoxacademy.restbackend.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Welcome {

  @Autowired
  Greeter greeter;

  private String welcome_message;

  public Welcome(Greeter greeter) {
    this.welcome_message = "Oh, hi there " + greeter.getName() + ", my dear " + greeter.getTitle
            () + "!";
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }
}
