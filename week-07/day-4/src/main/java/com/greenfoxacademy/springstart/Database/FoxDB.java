package com.greenfoxacademy.springstart.Database;

import com.greenfoxacademy.springstart.Model.Fox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FoxDB {

  private List<Fox> foxDB;

  public FoxDB() {
    foxDB = new ArrayList<>(Arrays.asList(new Fox("Will", "hot dog", "beer"),
            new Fox("Jane", "ice cream", "smoothie")));
  }
}
