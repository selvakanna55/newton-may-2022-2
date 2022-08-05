package oops2.accessmodifier;

 class SamePackageSubClass extends VehicleExample {
    // NA - private
    String driver;
    String conductor;
    int noOfPassengers;


    public void print() {
        setModel("fvr");
        System.out.println(getModel() + "" + gears + " " + seats + " " + " " + brand + " " + driver + " " + conductor + " " + noOfPassengers);
    }
}


public class SamePackageSubClassExample{
    public static void main(String[] args) {
        SamePackageSubClass spsc = new SamePackageSubClass();
        spsc.seats = 100;
        spsc.driver = "sdkfjn";
        spsc.conductor = "sdkfjn";
        spsc.gears = 4;
        spsc.setModel("1234");
        spsc.brand = "BMW";
        spsc.print();

    }
}