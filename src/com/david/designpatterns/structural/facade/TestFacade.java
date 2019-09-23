package com.david.designpatterns.structural.facade;

public class TestFacade {

  public static void main(String[] args) {

    System.out.println("***Client is going to order food in a restaurant***");
    /**
     * In this case, the restaurant is the facade because we can't see what is behind the food's
     * preparation
     */
    Restaurant restaurant = new Restaurant("Bandu's Restaurant");
    restaurant.orderFood(Menu.HAMBURGER);
    restaurant.orderFood(Menu.PIZZA);
    restaurant.orderFood(Menu.TACOS);

    if (restaurant.isDone()) {
      System.out.println("The food is ready!");
    }
  }
}
