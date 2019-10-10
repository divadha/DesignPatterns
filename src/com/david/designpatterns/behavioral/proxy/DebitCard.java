package com.david.designpatterns.behavioral.proxy;

public class DebitCard {
  private Account account;
  private String cardNumber;

  public DebitCard(Account account, String cardNumber) {
    this.account = account;
    this.cardNumber = cardNumber;
  }

  public void getMoney(double money) {
    if (money < account.getBalance()) {
      account.setBalance(account.getBalance() - money);
    } else {
      System.out.print("Sorry you don't have enough money, your balance is ");
      System.out.println(account.getBalance());
    }
  }

  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }
}
