package com.greenfoxacademy.springstart.com.greenfoxacademy.springstart.model;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class BankAccount {

  private String name;
  private String balance;
  private String animalType;
  private NumberFormat formatter;

  public BankAccount(String name, String balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }

  public BankAccount() {
  }

  public String getName() {
    return name;
  }

  public String getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }
}
