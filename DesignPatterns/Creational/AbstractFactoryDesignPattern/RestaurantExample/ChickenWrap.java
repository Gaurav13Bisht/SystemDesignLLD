package DesignPatterns.Creational.AbstractFactoryDesignPattern.RestaurantExample;

public class ChickenWrap implements Wrap{
    @Override
    public void prepare() {
        System.out.println("Prepared Chicken Wrap.");
    }
}
