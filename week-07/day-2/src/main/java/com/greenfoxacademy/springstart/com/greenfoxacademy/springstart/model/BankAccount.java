package com.greenfoxacademy.springstart.com.greenfoxacademy.springstart.model;

import java.util.concurrent.atomic.AtomicLong;

public class BankAccount {

  private String name;
  private float balance;
  private String animalType;
  private String currency;
  private long id;
  private static final AtomicLong number = new AtomicLong(0);

  public BankAccount(String name, float balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.currency = "Zebra";
    this.id = number.incrementAndGet();
  }

  public BankAccount() {
  }

  public String getName() {
    return name;
  }

  public float getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public String getCurrency() {
    return currency;
  }

  public long getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBalance(float balance) {
    this.balance = balance;
  }

  public String balanceWith2Decimals(){
    return String.format("%.02f", balance);
  }

  /*@Override
  public String toString() {
    return "name: " + name + ", balance: " + String.format("%.02f", balance) + " " + currency
            + ", " +
            "animalType: " + animalType;
  }*/
}
