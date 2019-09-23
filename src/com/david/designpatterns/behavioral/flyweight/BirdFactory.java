package com.david.designpatterns.behavioral.flyweight;

public class BirdFactory {

  public Bird getBird(String color) {
    switch (color) {
      case "BLUE":
        return new BlueBird();
      case "RED":
        return new RedBird();
      case "YELLOW":
        return new YellowBird();
    }
    return null;
  }
}
