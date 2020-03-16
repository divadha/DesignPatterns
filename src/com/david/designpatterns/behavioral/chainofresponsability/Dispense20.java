package com.david.designpatterns.behavioral.chainofresponsability;

public class Dispense20 {

    public void dispense(int amount) {
        if (amount >= 20) {
            int buck = amount / 20;
            int remainder = amount % 20;
            System.out.println("Dispensing " + buck + " bucks of $20");
            if (remainder != 0) {
                new Dispense10().dispense(remainder);
            }
        } else {
            new Dispense10().dispense(amount);
        }
    }
}
