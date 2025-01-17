package DesignPatterns.AbstractFactoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        Restaurant chickenBurgerRestaurant = new ChickenRestaurant();
        chickenBurgerRestaurant.orderBurger();
        chickenBurgerRestaurant.orderWrap();

        Restaurant eggBurgerRestaurant = new EggRestaurant();
        eggBurgerRestaurant.orderBurger();
        eggBurgerRestaurant.orderWrap();
    }
}
