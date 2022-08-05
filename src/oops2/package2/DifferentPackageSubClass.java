package oops2.package2;

import oops2.accessmodifier.VehicleExample;

class Bus extends VehicleExample {
    String driver;
    String conductor;
    int noOfPassengers;


    public void print() {
        setModel("fvr");
        System.out.println(getModel() + "" + "gears" + " " + seats + " " + " " + brand + " " + driver + " " + conductor + " " + noOfPassengers);
    }

}

public class DifferentPackageSubClass {
}
