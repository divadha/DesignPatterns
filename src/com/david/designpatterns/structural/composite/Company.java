package com.david.designpatterns.structural.composite;

import java.util.HashMap;
import java.util.Map;

public class Company {

  Map<String, Employee> employees = null;
  private String name;

  public Company(String name) {
    this.name = name;
    employees = new HashMap<>();
  }

  public void addEmployee(String position, Employee employee) {
    employees.put(position, employee);
  }

  public void removeEmployee(String employee) {
    employees.remove(employee);
  }

  public void showDetails() {
    System.out.println("Details about this company");
    System.out.println("Company name = " + name);
    System.out.println("########################");
    System.out.println("List of employees\n");
    employees.forEach(
        (key, value) -> {
          System.out.println("Position: " + key.toUpperCase());
          value.showDetails();
        });
  }
}
