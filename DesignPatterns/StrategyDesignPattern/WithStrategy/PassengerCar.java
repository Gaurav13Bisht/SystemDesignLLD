package DesignPatterns.StrategyDesignPattern.WithStrategy;

import DesignPatterns.StrategyDesignPattern.WithStrategy.Strategy.ManualCarStrategy;

public class PassengerCar extends Vehicle{
    public PassengerCar() {
        super(new ManualCarStrategy());
    }
}
