package DesignPatterns.Creational.AbstractFactoryDesignPattern.RestaurantExample;

public class EggWrap implements Wrap{
    @Override
    public void prepare() {
        System.out.println("Prepared Egg Wrap.");
    }
}
