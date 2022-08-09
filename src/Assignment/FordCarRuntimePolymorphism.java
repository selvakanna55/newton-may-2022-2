package Assignment;

class Car {
    private String name;
    private double currentSpeed;

    Car(String name, double speed) {
        this.name = name;
        this.currentSpeed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void print() {
        System.out.println(this.name + " is moving at speed of " + this.currentSpeed + "Kph");
    }
}

// Frod - > sub class  (child class)
//Car -> super class (parent class)
class Ford extends Car {
    String model;

    Ford(String name, double currentSpeed, String carModel) {
        super(name, currentSpeed); // calling parent class constructor
        model = carModel;
    }

    void startEngine() {
        System.out.println(getName() + " is started!!");
    }

    void accelerate() {
        System.out.println(getName() + " is accelerating!!");
    }

    void brake() {
        System.out.println("Brake is applied on " + getName() + ", stopped successfully!!");
    }

    public void print() { // overriding
        System.out.println(getName() + " " + model + " is moving at speed of " + getCurrentSpeed() + "Kph");
    }
}
//Implement ford class here which inherits Car class
