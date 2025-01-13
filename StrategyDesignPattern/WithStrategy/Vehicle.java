package StrategyDesignPattern.WithStrategy;

import StrategyDesignPattern.WithStrategy.Strategy.GearStrategy;

public class Vehicle {
    public GearStrategy gearStrategy;

    public Vehicle(GearStrategy gearStrategy){
        this.gearStrategy = gearStrategy;
    }

    public void gears(){
        gearStrategy.gears();
    }
}