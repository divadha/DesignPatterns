package com.david.designpatterns.behavioral.chainofresponsability;

public class Dispense10 {

    public void dispense(int amount) {
        if (amount >= 10) {
            int buck = amount / 10;
            System.out.println("Dispensing " + buck + " bucks of $10");
        }
    }
}
