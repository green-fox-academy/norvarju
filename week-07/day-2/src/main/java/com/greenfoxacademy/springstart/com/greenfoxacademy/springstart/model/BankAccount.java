package com.greenfoxacademy.springstart.com.greenfoxacademy.springstart.model;

public class BankAccount {

  private String name;
  private float balance;
  private String animalType;
  private String currency;

  public BankAccount(String name, float balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.currency = "Zebra";
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

  public void setName(String name) {
    this.name = name;
  }

  public void setBalance(float balance) {
    this.balance = balance;
  }

  @Override
  public String toString() {
    return "name='" + name + '\'' + ", balance='" + String.format("%.02f", balance) + " " + currency
            +'\'' + ", " +
            "animalType='" + animalType + '\'';
  }
}
