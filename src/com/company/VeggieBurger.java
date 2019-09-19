package com.company;

public class VeggieBurger {
    private String name;
    private String veggie;
    private double price;
    private String breadRollType;

    public VeggieBurger(String name, String veggie, double price, String breadRollType) {
        this.name = name;
        this.veggie = veggie;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public void addVeggieBurgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addVeggieBurgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addVeggieBurgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addVeggieBurgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeBurger(){
        double burgerPrice = this.price;
        System.out.println(this.name + " burger on a " + this.breadRollType + " roll with " +
                this.veggie + ", price is " + this.price + " AZN");
        if (this.addition1Name != null){
            burgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }
        if (this.addition2Name != null){
            burgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }
        if (this.addition3Name != null){
            burgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }
        if (this.addition4Name != null){
            burgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }
        return burgerPrice;
    }

}