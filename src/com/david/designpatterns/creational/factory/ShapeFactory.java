package com.david.designpatterns.creational.factory;

public class ShapeFactory {

  public Shape getShape(String shapeType) {

    switch (shapeType) {
      case "RECTANGLE":
        return new Rectangle();
      case "CIRCLE":
        return new Circle();
      case "SQUARE":
        return new Square();
      default:
        return null;
    }
  }
}
