package DesignPatterns.FactoryDesignPattern;

public class EggBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Prepared Egg Burger.");
    }
}
