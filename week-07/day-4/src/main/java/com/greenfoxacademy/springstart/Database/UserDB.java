package com.greenfoxacademy.springstart.Database;

import com.greenfoxacademy.springstart.Model.Fox;
import com.greenfoxacademy.springstart.Model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class UserDB {

  private List<User> userDB;

  public UserDB() {
    userDB = new ArrayList<>(Arrays.asList(
            new User("George", 24, "american", "Jerry"),
            new User("Jane", 31, "british", "Mungo"),
            new User("Jon", 35, "swedish", "Patrick")));
  }

  public User findUser(String nameToCheck) {
    for (User user : userDB) {
      if (user.getUserName().equals(nameToCheck)) {
        return user;
      }
    }
    return null;
  }
}
