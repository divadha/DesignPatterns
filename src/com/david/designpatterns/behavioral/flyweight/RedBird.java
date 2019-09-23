package com.david.designpatterns.behavioral.flyweight;

public class RedBird implements Bird {

  private static final String COLOR = "RED";

  @Override
  public void fly() {
    System.out.println(COLOR + " bird is flying to the target");
  }
}
