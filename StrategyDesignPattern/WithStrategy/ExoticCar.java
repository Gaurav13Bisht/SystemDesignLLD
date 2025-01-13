package StrategyDesignPattern.WithStrategy;

import StrategyDesignPattern.WithStrategy.Strategy.AutomaticCarStrategy;

public class ExoticCar extends Vehicle{
    public ExoticCar() {
        super(new AutomaticCarStrategy());
    }
}