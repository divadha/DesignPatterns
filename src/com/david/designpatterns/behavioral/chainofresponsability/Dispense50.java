package com.david.designpatterns.behavioral.chainofresponsability;

public class Dispense50 {

    public void dispense(int amount) {
        if (amount >= 50) {
            int buck = amount / 50;
            int remainder = amount % 50;
            System.out.println("Dispensing " + buck + " bucks of $50");
            if (remainder != 0) {
                new Dispense20().dispense(remainder);
            }
        } else {
            new Dispense20().dispense(amount);
        }
    }
}
