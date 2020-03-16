package com.david.designpatterns.behavioral.chainofresponsability;

/**
 * It’s a series of processing objects, each processing object in the chain is responsible
 * for a certain type of actions if the process is done,
 * it passes the request to the next processor in the chain
 */
public class TestATM {
    public static void main(String[] args) {
        int amount = 1000;
        ATM atm = new ATM();
        System.out.println("************* Dispensing : $" + amount);
        atm.dispense(amount);

        amount = 250;
        System.out.println("************* Dispensing : $" + amount);
        atm.dispense(amount);

        amount = 130;
        System.out.println("************* Dispensing : $" + amount);
        atm.dispense(amount);

        amount = 450;
        System.out.println("************* Dispensing : $" + amount);
        atm.dispense(amount);

        amount = 890;
        System.out.println("************* Dispensing : $" + amount);
        atm.dispense(amount);

        amount = 60;
        System.out.println("************* Dispensing : $" + amount);
        atm.dispense(amount);
    }
}
