package com.company;

public class DeluxeBurger extends VeggieBurger{
    public DeluxeBurger() {
        super("Deluxe Burger", "Sweet Potato & Black Bean", 8.70, "Rye");
        super.addVeggieBurgerAddition1("Apple Chips", 2.50);
        super.addVeggieBurgerAddition2("Smoothie", 3.50);
    }

    @Override
    public void addVeggieBurgerAddition1(String name, double price) {
        System.out.println("Cannot be added to Deluxe Burger");
    }

    @Override
    public void addVeggieBurgerAddition2(String name, double price) {
        System.out.println("Cannot be added to Deluxe Burger");
    }

    @Override
    public void addVeggieBurgerAddition3(String name, double price) {
        System.out.println("Cannot be added to Deluxe Burger");
    }

    @Override
    public void addVeggieBurgerAddition4(String name, double price) {
        System.out.println("Cannot be added to Deluxe Burger");
    }
}
