package DesignParkingLot;


public class Floor {
    int floorNo;
    int totalNoOfSlots;
    int currentlyOccupiedSlots;

    Floor(int totalNoOfSlots, int floorNo) {
        this.floorNo = floorNo;
        this.totalNoOfSlots = totalNoOfSlots;
        this.currentlyOccupiedSlots = 0;
    }

    boolean canIPark() {
        return (totalNoOfSlots - currentlyOccupiedSlots) > 0;
    }

    void display() {
        System.out.println("Total no of available slots:" + (totalNoOfSlots - currentlyOccupiedSlots));
    }
}