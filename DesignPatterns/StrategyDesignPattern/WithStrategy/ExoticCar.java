package DesignPatterns.StrategyDesignPattern.WithStrategy;

import DesignPatterns.StrategyDesignPattern.WithStrategy.Strategy.AutomaticCarStrategy;

public class ExoticCar extends Vehicle{
    public ExoticCar() {
        super(new AutomaticCarStrategy());
    }
}