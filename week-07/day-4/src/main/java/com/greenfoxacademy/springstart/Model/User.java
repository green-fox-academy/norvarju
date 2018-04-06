package com.greenfoxacademy.springstart.Model;

public class User {

  private String userName;
  private int age;
  private String residency;

  public User(String userName, int age, String residency) {
    this.userName = userName;
    this.age = age;
    this.residency = residency;
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

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setResidency(String residency) {
    this.residency = residency;
  }
}
