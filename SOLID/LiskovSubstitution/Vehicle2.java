package SOLID.LiskovSubstitution;

import java.util.List;

    /*  This design follow Liskov Substitution Principle since Vehicle2 is the base/super class which have
        two subclasses EngineVehicle and Bicycle in which both EngineVehicle's and Bicycle's object can
        be replaced with Vehicle2's object and vice versa since both have valid behaviours/methods.
        And similarly EngineVehicle is the base/super class which have two subclasses Car2 and Bike
        in which both Car2's and Bike's object can be replaced with Vehicle2's object and vice versa since
        both have valid behaviours/methods.

        So basically when extending a class, don't narrow down the functionality of base class.
     */

public class Vehicle2 {
    public Integer noOfWheels() {
        return 4; // Assuming 4 wheels vehicle as default
    }

}

class EngineVehicle extends Vehicle2{
    public List<String> modesAvailable() {
        return List.of("Sports", "Racing", "Standard");     // First is default mode
    }
}


class Car2 extends EngineVehicle {
    @Override
    public List<String> modesAvailable() {
        return List.of("OffRoad", "Racing");
    }
}

class Bike extends EngineVehicle {
    @Override
    public List<String> modesAvailable() {
        return List.of("Racing", "Standard");
    }
}

class Bicycle2 extends Vehicle2 {
    @Override
    public Integer noOfWheels() {
        return 2;
    }

    public Integer noOfGears(){
        return 5;
    }
}

class Main2 {
    public static void main(String[] args) {
        Vehicle2 vehicle1 = new Car2();
        Vehicle2 vehicle2 = new Bicycle2();
        List<Vehicle2> vehicleList = List.of(vehicle1, vehicle2);

        for (Vehicle2 vehicle : vehicleList) {
            // Vehicle2 doesn't have modesAvailable() method now so no issue.
            // System.out.println("No. of wheels: " + vehicle.noOfWheels() + " & Default mode: " + vehicle.modesAvailable().get(0));
            System.out.println("No. of wheels: " + vehicle.noOfWheels());
        }

        EngineVehicle vehicle3 = new Car2();
        EngineVehicle vehicle4 = new Bike();
        List<EngineVehicle> EngineVehicleList = List.of(vehicle3, vehicle4);

        for (EngineVehicle engineVehicle : EngineVehicleList) {
            // engineVehicle have noOfWheels() and modesAvailable() method now so no issue.
             System.out.println("No. of wheels: " + engineVehicle.noOfWheels() + " & Default mode: " + engineVehicle.modesAvailable().get(0));
        }
    }
}