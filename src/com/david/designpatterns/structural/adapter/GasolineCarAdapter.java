package com.david.designpatterns.structural.adapter;

public class GasolineCarAdapter implements ElectricCar {
  GasolineCar car;

  public GasolineCarAdapter(GasolineCar car) {
    this.car = car;
  }

  @Override
  public void drive() {
    car.drive();
  }

  @Override
  public void charge() {
    car.putGas();
  }
}
