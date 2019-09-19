package com.company;

public class VeganBurger extends VeggieBurger {
    private String veganBurgerExtra1Name;
    private double veganBurgerExtra1Price;

    private String veganBurgerExtra2Name;
    private double veganBurgerExtra2Price;

    public VeganBurger(String veggie, double price) {
        super("Vegan Burger", veggie, price, "Rye");
    }

    public void addVeganExtra1(String name, double price){
        this.veganBurgerExtra1Name = name;
        this.veganBurgerExtra1Price = price;
    }

    public void addVeganExtra2(String name, double price){
        this.veganBurgerExtra2Name = name;
        this.veganBurgerExtra2Price = price;
    }

    @Override
    public double itemizeBurger() {
        double veganBurgerPrice = super.itemizeBurger();
        if (this.veganBurgerExtra1Name != null){
            veganBurgerPrice += veganBurgerExtra1Price;
            System.out.println("Added " + veganBurgerExtra1Name + " for an extra " + veganBurgerExtra1Price);
        }
        if (this.veganBurgerExtra2Name != null){
            veganBurgerPrice += veganBurgerExtra2Price;
            System.out.println("Added " + veganBurgerExtra2Name + " for an extra " + veganBurgerExtra2Price);
        }
        return veganBurgerPrice;
    }
}
