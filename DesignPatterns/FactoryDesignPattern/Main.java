package DesignPatterns.FactoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        Restaurant chickenBurgerRestaurant = new ChickenBurgerRestaurant();
        chickenBurgerRestaurant.orderBurger();

        Restaurant eggBurgerRestaurant = new EggBurgerRestaurant();
        eggBurgerRestaurant.orderBurger();
    }
}
