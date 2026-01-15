package DesignPatterns.Behavioural.StrategyDesignPattern.WithStrategy;

import DesignPatterns.Behavioural.StrategyDesignPattern.WithStrategy.Strategy.AutomaticCarStrategy;

public class ElectricCar extends Vehicle{
    public ElectricCar(){
        super(new AutomaticCarStrategy());
    }
}