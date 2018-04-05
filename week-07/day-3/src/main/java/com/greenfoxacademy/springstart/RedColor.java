package com.greenfoxacademy.springstart;

import org.springframework.stereotype.Component;

@Component
public class RedColor implements MyColor {
  @Override
  public String printColor() {
    return "It's red color.";
  }
}
