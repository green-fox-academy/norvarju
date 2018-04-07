package com.greenfoxacademy.springstart.Database;

import com.greenfoxacademy.springstart.Model.Fox;
import com.greenfoxacademy.springstart.Model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class FoxDB {

  private List<Fox> foxDB;

  public FoxDB() {
    foxDB = new ArrayList<>(Arrays.asList(
            new Fox("Jerry", "hotdog", "beer", Arrays.asList("farts",
                    "burps")),
            new Fox("Mungo", "pizza", "coke", Arrays.asList("does ballet dancing", "sings " +
                    "opera aria", "knows every capital city by heart")),
            new Fox("Patrick", "pie", "ice tea", Arrays.asList("giggles when tickling", "does " +
                    "yoga", "eats with chopsticks", "immitates famous people", "cook ramen"))));
  }

  public Fox findFox(String foxToCheck) {
    for (Fox fox : foxDB) {
      if (fox.getName().equals(foxToCheck)) {
        return fox;
      }
    }
    return null;
  }
}
