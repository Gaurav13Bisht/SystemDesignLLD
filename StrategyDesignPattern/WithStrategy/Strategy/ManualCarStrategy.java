package StrategyDesignPattern.WithStrategy.Strategy;

public class ManualCarStrategy implements GearStrategy {
    @Override
    public void gears() {
        System.out.println("This has 5 manual gears.");
    }
}