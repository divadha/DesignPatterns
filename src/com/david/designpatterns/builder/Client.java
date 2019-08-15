package com.david.designpatterns.builder;

public class Client {
  public static void main(String[] args) {
    Director director = new Director();

    System.out.println("*** Builder Pattern ***");
    BuilderInterface car = new Car();
    BuilderInterface moto = new MotorCycle();

    director.construct(car);
    Product carProduct = car.getVehicle();
    carProduct.show();

    director.construct(moto);
    Product motoProduct = moto.getVehicle();
    motoProduct.show();
  }
}
