package DesignPatterns.Behavioural.StrategyDesignPattern.WithoutStrategy;

public class Main {
    public static void main(String[] args) {
        ExoticCar exoticCar = new ExoticCar();
        exoticCar.gears();

        ElectricCar electricCar = new ElectricCar();
        electricCar.gears();

        PassengerCar passengerCar = new PassengerCar();
        passengerCar.gears();

    }
}

// The issue with this Design pattern is that when multiple child classes needs same functionality but parent doesn't have it,
// so we will have to put the same code in all the child classes hence code reusability will be poor.
// And if any change required, the all classes have to be changed