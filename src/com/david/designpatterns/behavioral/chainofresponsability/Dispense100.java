package com.david.designpatterns.behavioral.chainofresponsability;

public class Dispense100 {

    public void dispense(int amount) {
        if (amount >= 100) {
            int buck = amount / 100;
            int remainder = amount % 100;
            System.out.println("Dispensing " + buck + " bucks of $100");
            if (remainder != 0) {
                new Dispense50().dispense(remainder);
            }
        } else {
            new Dispense50().dispense(amount);
        }
    }
}
