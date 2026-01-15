package DesignPatterns.Behavioural.StrategyDesignPattern.WithStrategy;

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

// Now, Strategy Design pattern has removed the need of duplicate code since the common functionality is now put in a
// single class and that class is used wherever required as a implementation of the interface.
// And now if any change is required, it will only be required at the particular strategy class