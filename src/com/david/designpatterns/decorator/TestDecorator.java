package com.david.designpatterns.decorator;

public class TestDecorator {
  public static void main(String[] args) {

    Car car = new Car();
    car.setType("Civic");
    car.setColor("Red");
    car.setNoWheels(4);
    car.setEngine("6 cylinders");

    System.out.println("Agency car:" + car);

    CarTuning carTuning = new CarTuning(car);
    carTuning.setCost(50000.00);
    carTuning.addEngineAccessory("Turbo");
    carTuning.addCarAccessory("20 \" Wheels");
    carTuning.addCarAccessory("headlights");
    System.out.println("Tuning car:" + carTuning);
  }
}
