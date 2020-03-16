package com.david.designpatterns.creational.builder;

public class Coffee {

    private String type;
    private boolean milk;
    private boolean sugar;
    private String size;

    public Coffee(CoffeeBuilder builder) {
        type = builder.getType();
        milk = builder.isMilk();
        sugar = builder.isSugar();
        size = builder.getSize();
    }

    @Override
    public String toString() {
        return "Coffee: " + type + ", " +
                (milk ? "with" : "No") + " milk, " +
                (sugar ? "with" : "No") + " sugar, " +
                size + " Size";
    }
}
