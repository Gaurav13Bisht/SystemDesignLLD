package DesignPatterns.Creational.FactoryDesignPattern.RestaurantExample;

public class ChickenBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Prepared Chicken Burger");
    }
}