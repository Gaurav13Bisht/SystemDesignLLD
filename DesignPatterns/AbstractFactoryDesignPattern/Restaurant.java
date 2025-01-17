package DesignPatterns.AbstractFactoryDesignPattern;

// This is the factory method

public abstract class Restaurant {
    public Burger orderBurger(){
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }

    public abstract Burger createBurger();

    // We can create new abstract class extending this class and add orderWrap and createWrap there to follow Open/close principle
    public Wrap orderWrap(){
        Wrap wrap = createWrap();
        wrap.prepare();
        return wrap;
    }

    public abstract Wrap createWrap();
}