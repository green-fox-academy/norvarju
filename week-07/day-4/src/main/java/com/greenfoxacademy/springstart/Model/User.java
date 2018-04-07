package com.greenfoxacademy.springstart.Model;

import org.springframework.stereotype.Component;

@Component
public class User {

  private String userName;
  private int age;
  private String residency;
  private String myFox;

  public User() {
  }

  public User(String userName, int age, String residency, String myFox) {
    this.userName = userName;
    this.age = age;
    this.residency = residency;
    this.myFox = myFox;
  }

  public String getUserName() {
    return userName;
  }

  public int getAge() {
    return age;
  }

  public String getResidency() {
    return residency;
  }

  public String getMyFox() {
    return myFox;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setResidency(String residency) {
    this.residency = residency;
  }

  public void setMyFox(String myFox) {
    this.myFox = myFox;
  }
}
