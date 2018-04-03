package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Counter {

  private static final AtomicLong number = new AtomicLong(0);
  private long counter;

  public Counter(AtomicLong counter) {
    this.counter = number.incrementAndGet();
  }

  public long getCounter() {
    return counter;
  }

  public static AtomicLong getNumber() {
    return number;
  }
}
