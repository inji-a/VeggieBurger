package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, what is your order? Please select \n1-Basic, 2-Vegan, 3-Deluxe");
        int input = sc.nextInt();
        int basic = 1;
        int vegan = 2;
        int deluxe = 3;

        if (input == basic) {
            VeggieBurger veggieBurger = new VeggieBurger("Basic", "bean",
                    2.50, "rye");
            double price = veggieBurger.itemizeBurger();
            System.out.println("Would you like additions? If yes, please select:" +
                    "\n1-Cheese, 2-Tomato, 3-Onion, 4-Mushroom");
            int addition = sc.nextInt();
            for (int i = 0; addition > 4; i++) {
                if (addition == 1) {
                    veggieBurger.addVeggieBurgerAddition1("Cheese", 0.50);
                    System.out.println("Total price is " + veggieBurger.itemizeBurger());
                } else if (addition == 2) {
                    veggieBurger.addVeggieBurgerAddition2("Tomato", 1.50);
                    System.out.println("Total price is " + veggieBurger.itemizeBurger());
                } else if (addition == 3) {
                    veggieBurger.addVeggieBurgerAddition3("Onion", 1.00);
                    System.out.println("Total price is " + veggieBurger.itemizeBurger());
                } else if (addition == 4) {
                    veggieBurger.addVeggieBurgerAddition1("Mushroom", 2.50);
                    System.out.println("Total price is " + veggieBurger.itemizeBurger());
                }
            }
        } else if (input == vegan) {
            VeganBurger veganBurger = new VeganBurger("Tofu", 4.50);
            veganBurger.itemizeBurger();
        } else if (input == deluxe){
            DeluxeBurger deluxeBurger = new DeluxeBurger();
            System.out.println("Total price is " + deluxeBurger.itemizeBurger());
        }
    }
}