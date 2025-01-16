package AbstractFactoryDesignPattern;

public class ChickenRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new ChickenBurger();
    }

    // We can create new class extending this class and add createWrap there to follow Open/close principle
    @Override
    public Wrap createWrap(){
        return new ChickenWrap();
    }

}