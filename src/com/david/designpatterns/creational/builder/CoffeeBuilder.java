package com.david.designpatterns.creational.builder;

public class CoffeeBuilder {
    private String type;
    private boolean milk;
    private boolean sugar;
    private String size;


    public CoffeeBuilder type(String type) {
        this.type = type;
        return this;
    }

    public CoffeeBuilder milk(boolean milk) {
        this.milk = milk;
        return this;
    }

    public CoffeeBuilder sugar(boolean sugar) {
        this.sugar = sugar;
        return this;
    }

    public CoffeeBuilder size(String size) {
        this.size = size;
        return this;
    }

    public Coffee build() {
        return new Coffee(this);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean isSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
