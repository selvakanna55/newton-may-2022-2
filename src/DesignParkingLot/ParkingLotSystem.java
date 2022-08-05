package DesignParkingLot;

import java.util.HashMap;

public class ParkingLotSystem {
    public static void main(String[] args) {
        HashMap<VehicleType, Floor> floorMapping = new HashMap<>();
        Floor f1 = new Floor(100, 1);
        floorMapping.put(VehicleType.CAR, f1);
        floorMapping.put(VehicleType.BIKE, new Floor(150, 2));
        floorMapping.put(VehicleType.TRUCK, new Floor(50, 3));


        EntryGate m1 = new EntryGate("Chintu");
        Vehicle v1 = new Vehicle("MZ12AA4455", VehicleType.CAR, "White", "Tesla", "X");
        floorMapping.get(v1.vehicleType).display();
        Ticket teslaTicket = m1.issueTicket(v1, floorMapping);
        floorMapping.get(v1.vehicleType).display();
        System.out.println("TicketNo:" + teslaTicket.ticketNo);
        System.out.println("FloorNo:" + teslaTicket.floor.floorNo);
        System.out.println("EntryTime:" + teslaTicket.entryTime);
    }
}

class Vehicle {
    public Vehicle(String number, VehicleType vehicleType, String color, String brand, String model) {
        this.number = number;
        this.vehicleType = vehicleType;
        this.color = color;
        this.brand = brand;
        this.model = model;
    }

    String number;
    VehicleType vehicleType;
    String color;
    String brand;
    String model;


}

class Gate {
    String security;

    Gate(String security) {
        this.security = security;
    }

}

class Ticket {
    int ticketNo;
    Floor floor;
    String entryTime;

    public Ticket(int ticketNo, Floor floor, String entryTime) {
        this.ticketNo = ticketNo;
        this.floor = floor;
        this.entryTime = entryTime;
        floor.currentlyOccupiedSlots++;
    }

}

class EntryGate extends Gate {
    int ticketNo = 1;

    EntryGate(String security) {
        super(security); // calling parent class constyructro
    }


    Ticket issueTicket(Vehicle v, HashMap<VehicleType, Floor> floorMapping) {
        // returning an object from function
        //find right floor for vehicle
        Floor currentFloor = floorMapping.get(v.vehicleType);
        if (currentFloor.canIPark() == false) {
            System.out.println("Parking is full");
            return null;
        }
        Ticket t1 = new Ticket(ticketNo, currentFloor, "10:30");
        ticketNo++;
        return t1;
    }
}

enum VehicleType {
    TRUCK, CAR, BIKE
}

