package StrategyDesignPattern.WithStrategy;

import StrategyDesignPattern.WithStrategy.Strategy.ManualCarStrategy;

public class PassengerCar extends Vehicle{
    public PassengerCar() {
        super(new ManualCarStrategy());
    }
}
