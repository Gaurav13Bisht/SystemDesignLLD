package StrategyDesignPattern.WithStrategy.Strategy;

public class AutomaticCarStrategy implements GearStrategy {

    @Override
    public void gears() {
        System.out.println("This is automatic so no manual gears.");
    }
}