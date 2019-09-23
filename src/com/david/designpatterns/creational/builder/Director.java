package com.david.designpatterns.creational.builder;

public class Director {

  BuilderInterface builder;

  public void construct(BuilderInterface builder) {
    this.builder = builder;
    this.builder.buildBody();
    this.builder.insertWheels();
    this.builder.addHeadlights();
  }
}
