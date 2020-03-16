package com.david.designpatterns.creational.builder;

public class TestBuilder {

    public static void main(String[] args) {
        CoffeeBuilder builder = new CoffeeBuilder();
        Coffee coffee = builder.type("Express")
                .milk(true)
                .sugar(true)
                .size("Small")
                .build();
        System.out.println(coffee);

        coffee = builder.type("American")
                .milk(false)
                .sugar(false)
                .size("Medium")
                .build();
        System.out.println(coffee);

        coffee = builder.type("Black")
                .milk(false)
                .sugar(true)
                .size("Large")
                .build();
        System.out.println(coffee);

    }
}
