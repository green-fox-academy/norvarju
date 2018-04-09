package com.greenfoxacademy.springstart.Model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class Fox {

  private String name;
  private List<String> listOfTricks;
  private String food;
  private String drink;

  public Fox() {
  }

  public Fox(String name, String food, String drink, List<String> listOfTricks) {
    this.name = name;
    this.food = food;
    this.drink = drink;
    this.listOfTricks = listOfTricks;
  }

  public String getName() {
    return name;
  }

  public List<String> getListOfTricks() {
    return listOfTricks;
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

  public void setListOfTricks(List<String> listOfTricks) {
    this.listOfTricks = listOfTricks;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public void addTrick(String trick) {
    listOfTricks.add(trick);
  }

  public boolean isTrickLearntYet(String newTrick) {
    return listOfTricks.contains(newTrick);
  }
}
