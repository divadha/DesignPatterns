package com.david.designpatterns.behavioral.chainofresponsability;

public class ATM {

    public void dispense(int amount) {
        if (amount >= 100 && amount % 10 == 0) {
            Dispense100 d100 = new Dispense100();
            d100.dispense(amount);
        }
    }
}
