package com.david.designpatterns.structural.adapter;

public interface ElectricCar {
  void drive();

  void charge();
}

class Tesla implements ElectricCar {

  @Override
  public void drive() {
    System.out.println("Driving...");
  }

  @Override
  public void charge() {
    System.out.println("Charging...");
  }
}
