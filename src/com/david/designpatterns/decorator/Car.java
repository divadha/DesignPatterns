package com.david.designpatterns.decorator;

public class Car {

  private String type;
  private String color;
  private int noWheels;
  private String engine;

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getNoWheels() {
    return noWheels;
  }

  public void setNoWheels(int noWheels) {
    this.noWheels = noWheels;
  }

  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  @Override
  public String toString() {
    return "type='"
        + type
        + '\''
        + ", color='"
        + color
        + '\''
        + ", noWheels="
        + noWheels
        + ", engine='"
        + engine
        + '\'';
  }
}
