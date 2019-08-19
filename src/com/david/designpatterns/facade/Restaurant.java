package com.david.designpatterns.facade;

public class Restaurant {

  private String name;
  private boolean done;

  public Restaurant(String name) {
    System.out.println("\t\tContacting the restaurant " + name);
    this.name = name;
  }

  public void orderFood(String food) {
    System.out.println("\t\t" + food + " has being ordered");
    Kitchen kitchen = new Kitchen();
    done = kitchen.cockingFood(food);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }
}
