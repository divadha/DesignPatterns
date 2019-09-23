package com.david.designpatterns.structural.composite;

public class TestComposite {
  public static void main(String[] args) {
    Company company = new Company("Intersys");
    company.addEmployee("Director", new Employee("Mark", 20000, "USA"));
    company.addEmployee("Manager", new Employee("David", 10000, "Mexico"));
    company.addEmployee("Developer", new Employee("Abraham", 1500, "Canada"));
    company.addEmployee("Senior Developer", new Employee("Luis", 2000, "Spain"));
    company.addEmployee("Junior Developer", new Employee("Jesus", 500, "Peru"));
    company.addEmployee("Middle Developer", new Employee("Maria", 1500, "Portugal"));

    company.showDetails();
  }
}
