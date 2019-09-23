package com.david.designpatterns.structural.facade;

public class Kitchen {

  public boolean cockingFood(String food) {
    Chef chef = new Chef("Mario");
    System.out.println("\t\t\tchef " + chef.getName() + " is preparing " + food);

    return true;
  }
}
