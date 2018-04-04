package com.greenfoxacademy.springstart.com.greenfoxacademy.springstart.model;

import java.util.concurrent.atomic.AtomicLong;

public class BankAccount {

  private String name;
  private float balance;
  private String animalType;
  private String currency;
  private long id;
  private static final AtomicLong number = new AtomicLong(0);
  private boolean isKing;

  public BankAccount(String name, float balance, String animalType, boolean isKing) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.currency = "Zebra";
    this.id = number.incrementAndGet();
    this.isKing = isKing;
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

  public boolean isKing() {
    return isKing;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBalance(float balance) {
    this.balance = balance;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public void setKing(boolean king) {
    isKing = king;
  }

  public String balanceWith2Decimals(){
    return String.format("%.02f", balance);
  }

  public String kingIndicator(){
    if(isKing){
      return "Yay, he is king";
    } else {
      return "Sadly he is not king";
    }
  }

  public float incrementing(){
    setBalance(getBalance()+10);
    return getBalance();
  }

  /*@Override
  public String toString() {
    return "name: " + name + ", balance: " + String.format("%.02f", balance) + " " + currency
            + ", " +
            "animalType: " + animalType;
  }*/
}
