package DesignPatterns.AbstractFactoryDesignPattern.RestaurantExample;

public class EggRestaurant extends Restaurant {

    @Override
    public Burger createBurger() {
        return new EggBurger();
    }

    // We can create new class extending this class and add createWrap there to follow Open/close principle
    @Override
    public Wrap createWrap(){
        return new EggWrap();
    }
}
