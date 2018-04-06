package com.greenfoxacademy.springstart.Model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Fox {

  private String name;
  private List<String> listOfString;
  private String food;
  private String drink;

  public Fox() {
  }

  public Fox(String name, List<String> listOfString, String food, String drink) {
    this.name = name;
    this.listOfString = listOfString;
    this.food = food;
    this.drink = drink;
  }

  public String getName() {
    return name;
  }

  public List<String> getListOfString() {
    return listOfString;
  }

  public String getFood() {
    return food;
  }

  public String getDrink() {
    return drink;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setListOfString(List<String> listOfString) {
    this.listOfString = listOfString;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }
}
