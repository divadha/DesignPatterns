package com.david.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Flyweight: It’s used when we need to create a large number of similar objects. We use a HashMap
 * that stores reference to the object which have already been created and use it instead of
 * creating a new one, we can implement a factory method to create all the different types of
 * objects.
 */
public class TestFlyweight {
  public static void main(String[] args) {
    // We create a map to storage all the different birds
    Map<String, Bird> birds = new HashMap<>();

    // Thanks to BirdFactory we create all the different birds
    BirdFactory factory = new BirdFactory();

    System.out.println(factory.getBird("BLUE"));

    birds.put("BLUE", factory.getBird("BLUE"));
    birds.put("YELLOW", factory.getBird("YELLOW"));
    birds.put("RED", factory.getBird("RED"));

    // We need 20 bird of 3 different types
    for (int i = 0; i < 20; i++) {
      System.out.print(i + " .- ");
      if (i % 3 == 0) {
        birds.get("BLUE").fly();
      } else if (i % 3 == 1) {
        birds.get("YELLOW").fly();
      } else if (i % 3 == 2) {
        birds.get("RED").fly();
      }
    }
  }
}
