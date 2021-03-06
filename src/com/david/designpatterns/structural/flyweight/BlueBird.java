package com.david.designpatterns.structural.flyweight;

public class BlueBird implements Bird {

  private static final String COLOR = "BLUE";

  @Override
  public void fly() {
    System.out.println(COLOR + " bird is flying to the target");
  }
}
