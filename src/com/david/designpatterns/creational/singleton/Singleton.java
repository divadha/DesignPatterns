package com.david.designpatterns.creational.singleton;

public class Singleton {

  private static Singleton singleton = null;

  private Singleton() {}

  public static Singleton getInstance() {
    if (singleton == null) {
      singleton = new Singleton();
    }
    return singleton;
  }

  public String hello() {
    return "Hello from Singleton";
  }
}
