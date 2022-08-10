package oops2.abstraction;


//interface -> implement
//class -> extend
interface AnimalInterface { // blue print
    // you cannot create an object for interface
    void walk();

    void sound();
}


class Lion1 implements AnimalInterface {
    public void walk() {
        System.out.println("Lion is walking");
    }

    public void sound() {
        System.out.println("roar");
    }

    void sayHelloToLion() {
        System.out.println("hello");
    }
}

class Goat1 implements AnimalInterface {


    public void walk() {
        System.out.println("goat is walking");
    }

    public void sound() {
        System.out.println("may");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Lion1 lion = new Lion1();
        lion.sound();
        lion.walk();
        lion.sayHelloToLion();
    }
}
