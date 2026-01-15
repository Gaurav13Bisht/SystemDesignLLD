package DesignPatterns.Behavioural.StrategyDesignPattern.WithStrategy;

import DesignPatterns.Behavioural.StrategyDesignPattern.WithStrategy.Strategy.AutomaticCarStrategy;

public class ExoticCar extends Vehicle{
    public ExoticCar() {
        super(new AutomaticCarStrategy());
    }
}