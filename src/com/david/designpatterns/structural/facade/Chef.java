package com.david.designpatterns.structural.facade;

public class Chef {

  private String name;

  public Chef(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
