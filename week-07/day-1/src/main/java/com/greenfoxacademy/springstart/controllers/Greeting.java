package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
  private static final AtomicLong number = new AtomicLong(0);
  private long id;
  private String content;

  public Greeting(AtomicLong id, String content) {
    this.id = number.incrementAndGet();
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }

  public static AtomicLong getNumber() {
    return number;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
