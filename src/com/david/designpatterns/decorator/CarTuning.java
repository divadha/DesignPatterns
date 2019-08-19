package com.david.designpatterns.decorator;

import java.util.ArrayList;
import java.util.List;

public class CarTuning extends Car {

  Car car;

  private List<String> engineAccessories;
  private List<String> carAccessories;
  private Double cost;

  public CarTuning(Car car) {
    this.car = car;
    engineAccessories = new ArrayList<>();
    carAccessories = new ArrayList<>();
  }

  public Double getCost() {
    return cost;
  }

  public List<String> getEngineAccessories() {
    return engineAccessories;
  }

  public List<String> getCarAccessories() {
    return carAccessories;
  }
  public void setCost(Double cost) {
    this.cost = cost;
  }

  public void addEngineAccessory(String accessory) {
    engineAccessories.add(accessory);
  }

  public void addCarAccessory(String accessory) {
    carAccessories.add(accessory);
  }

  @Override
  public String toString() {
    return car.toString()
        + ", engineAccessories="
        + engineAccessories
        + ", carAccessories="
        + carAccessories
        + ", cost="
        + cost;
  }
}
