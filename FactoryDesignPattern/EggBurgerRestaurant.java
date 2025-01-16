package FactoryDesignPattern;

public class EggBurgerRestaurant extends Restaurant{

    @Override
    public Burger createBurger() {
        return new EggBurger();
    }
}
