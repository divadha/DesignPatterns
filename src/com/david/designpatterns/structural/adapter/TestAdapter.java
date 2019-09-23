package com.david.designpatterns.structural.adapter;

public class TestAdapter {
  public static void main(String[] args) {

    System.out.println("*** Testing a Tesla ***");
    ElectricCar tesla = new Tesla();
    tesla.drive();
    tesla.charge();

    System.out.println("\n*** Testing a Corolla ***");
    GasolineCar corolla = new Toyota();
    corolla.drive();
    corolla.putGas();

    System.out.println("\n*** Testing a Prius ***");
    GasolineCar prius = new Toyota();
    ElectricCar priusAdapted = new GasolineCarAdapter(prius);
    priusAdapted.drive();
    priusAdapted.charge();
  }
}
