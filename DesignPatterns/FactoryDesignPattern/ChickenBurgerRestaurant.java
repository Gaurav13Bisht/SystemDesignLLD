package DesignPatterns.FactoryDesignPattern;

public class ChickenBurgerRestaurant extends Restaurant{
    @Override
    public Burger createBurger() {
        return new ChickenBurger();
    }
}