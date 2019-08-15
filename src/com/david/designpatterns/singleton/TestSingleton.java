package com.david.designpatterns.singleton;

public class TestSingleton {

  public static void main(String[] args) {
    Singleton s = Singleton.getInstance();
    System.out.println(s.hello());
  }
}
