package DesignPatterns.Behavioural.StrategyDesignPattern.WithStrategy;

import DesignPatterns.Behavioural.StrategyDesignPattern.WithStrategy.Strategy.GearStrategy;

public class Vehicle {
    public GearStrategy gearStrategy;

    public Vehicle(GearStrategy gearStrategy){
        this.gearStrategy = gearStrategy;
    }

    public void gears(){
        gearStrategy.gears();
    }
}