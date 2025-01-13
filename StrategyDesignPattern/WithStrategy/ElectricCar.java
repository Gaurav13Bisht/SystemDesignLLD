package StrategyDesignPattern.WithStrategy;

import StrategyDesignPattern.WithStrategy.Strategy.AutomaticCarStrategy;

public class ElectricCar extends Vehicle{
    public ElectricCar(){
        super(new AutomaticCarStrategy());
    }
}