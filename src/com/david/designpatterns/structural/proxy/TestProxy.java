package com.david.designpatterns.structural.proxy;

public class TestProxy {
  public static void main(String[] args) {
    // Creating an Account

    Account account = new Account();
    account.setId(1);
    account.setName("David");
    account.setBalance(1000);

    System.out.println("Initial balance: " + account);

    DebitCard card = new DebitCard(account, "5434 2344 0987 3453");
    System.out.println("Getting $200");
    card.getMoney(200);
    System.out.println("New balance: " + account);

    System.out.println("Getting $2000");
    card.getMoney(2000);
  }
}
