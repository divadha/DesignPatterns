package com.david.designpatterns.behavioral.flyweight;

public class YellowBird implements Bird {

  private static final String COLOR = "YELLOW";

  @Override
  public void fly() {
    System.out.println(COLOR + " bird is flying to the target");
  }
}
