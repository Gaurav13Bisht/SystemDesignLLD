package DesignPatterns.FactoryDesignPattern.RestaurantExample;

// This is the factory method

public abstract class Restaurant {
    public Burger orderBurger(){
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }

    public abstract Burger createBurger();
}