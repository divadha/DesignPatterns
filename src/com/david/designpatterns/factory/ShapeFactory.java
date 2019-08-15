package com.david.designpatterns.factory;

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
