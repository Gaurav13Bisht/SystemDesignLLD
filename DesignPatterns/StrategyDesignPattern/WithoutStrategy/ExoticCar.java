package DesignPatterns.StrategyDesignPattern.WithoutStrategy;

public class ExoticCar extends Vehicle{
    @Override
    public void gears(){
        System.out.println("This is automatic so no manual gears.");
    }
}