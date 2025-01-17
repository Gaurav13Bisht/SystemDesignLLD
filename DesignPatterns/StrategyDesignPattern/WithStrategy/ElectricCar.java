package DesignPatterns.StrategyDesignPattern.WithStrategy;

import DesignPatterns.StrategyDesignPattern.WithStrategy.Strategy.AutomaticCarStrategy;

public class ElectricCar extends Vehicle{
    public ElectricCar(){
        super(new AutomaticCarStrategy());
    }
}