package com.greenfoxacademy.springstart;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BlackColor implements MyColor {
  @Override
  public String printColor() {
    return "It's black color.";
  }
}
