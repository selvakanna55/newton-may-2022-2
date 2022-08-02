package oops2.parkinglot;

public class Vehicle {
    String vehicleNo;
    String model;
    String brand;
    String colour;

    VehicleType type;

    public Vehicle(String vehicleNo, String model, String brand, String colour, VehicleType type) {
        this.vehicleNo = vehicleNo;
        this.model = model;
        this.brand = brand;
        this.colour = colour;
        this.type = type;
    }


}
