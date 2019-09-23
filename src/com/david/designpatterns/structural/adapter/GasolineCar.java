package com.david.designpatterns.structural.adapter;

public interface GasolineCar {

  void drive();

  void putGas();
}

class Toyota implements GasolineCar {

  @Override
  public void drive() {
    System.out.println("Driving...");
  }

  @Override
  public void putGas() {
    System.out.println("Adding gasoline...");
  }
}
