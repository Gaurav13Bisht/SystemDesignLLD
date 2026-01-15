package DesignPatterns.Behavioural.StrategyDesignPattern.WithStrategy;

import DesignPatterns.Behavioural.StrategyDesignPattern.WithStrategy.Strategy.ManualCarStrategy;

public class PassengerCar extends Vehicle{
    public PassengerCar() {
        super(new ManualCarStrategy());
    }
}
