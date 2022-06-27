package oops;

class Bike{ // class -> blue print
    int wheels;
    int milege;
    String fuelType;
    String color;
    int maxSpeed;
    int cc;
    String name;

    void drive(){
        System.out.println("driving my bike");
    }
}

public class OopsRecallExample {
    public static void main(String[] args) {
        Bike superBike = new Bike();
        //clasName varName = new className
        //Scanner sc = new Scanner(System.in);
        superBike.name = "apache";
        superBike.cc =  180;
        superBike.color = "Red";
        System.out.println(superBike.color);
        superBike.drive();
    }
}
