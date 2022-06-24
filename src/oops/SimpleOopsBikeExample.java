package oops;

import java.util.Scanner;

class Car{
    int seats;
    String brand;
    String model;

    static int noOfGears=5;

    Car(int carSeats, String carBrand, String carModel){
        seats = carSeats;
        brand = carBrand;
        model = carModel;
    }

    static void drive(){
        System.out.println("im driving");
    }



    void applyBreak(){
        System.out.println("applied break, car stopped");
    }
}



public class SimpleOopsBikeExample {
    public static void main(String[] args) {
        Car audi = new Car(4, "Audi", "350d");
        audi.drive();
        System.out.println(audi.model);
        audi.applyBreak();
        System.out.println(audi.noOfGears);
        // without creating obj, access static variables, static functions
        Car.drive();
//        Car.applyBreak();
        System.out.println(Car.noOfGears);
//        modifying static variables
        audi.noOfGears = 3;
        System.out.println(audi.noOfGears);
        System.out.println(Car.noOfGears);


//        System.out.println(Car.brand);
    }
}
