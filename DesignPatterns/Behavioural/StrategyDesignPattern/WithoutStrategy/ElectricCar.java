package DesignPatterns.Behavioural.StrategyDesignPattern.WithoutStrategy;

public class ElectricCar extends Vehicle{
    @Override
    public void gears(){
        System.out.println("This is automatic so no manual gears.");
    }
}
