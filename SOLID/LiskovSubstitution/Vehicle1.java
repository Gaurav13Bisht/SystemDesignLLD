package SOLID.LiskovSubstitution;

import java.util.List;

    /*  This design do not follow Liskov Substitution Principle since it states that:
         "Objects of a superclass shall be replaceable with objects of its subclasses without breaking the application"

        Here, Vehicle is the base/super class which have two subclasses Car and Bicycle in which Car's object can
        be replaced with Vehicle's object and vice versa since both have similar behaviours/methods but Bicycle's
        object if replaced with Vehicle's object will break the application since modesAvailable() of bicycle returns
        null since its does not have any and will throw null pointer exception in such cases(Check main method).
     */

public class Vehicle1 {
    public Integer noOfWheels() {
        return 4; // Assuming 4 wheels vehicle as default
    }

    public List<String> modesAvailable() {
        return List.of("Sports", "Racing", "Standard");     // First is default mode
    }
}

class Car extends Vehicle1 {

    @Override
    public List<String> modesAvailable() {
        return List.of("OffRoad", "Standard");
    }
}

class Bicycle extends Vehicle1 {
    @Override
    public Integer noOfWheels() {
        return 2;
    }

    @Override
    public List<String> modesAvailable() {
        return null;
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle1 vehicle1 = new Car();
        Vehicle1 vehicle2 = new Bicycle();
        List<Vehicle1> vehicleList = List.of(vehicle1, vehicle2);

        for (Vehicle1 vehicle : vehicleList) {
            System.out.println("No. of wheels: " + vehicle.noOfWheels() + " & Default mode: " + vehicle.modesAvailable().get(0));
        }
    }
}