package oops2.abstraction;

abstract class Animal { // dont allow to create object for Animal
    void walk() {//non abstract fns
        System.out.println("Animal is walking");
    }

    abstract void sound();  // every child class should have sound fun, i.e implementing
}

class Lion extends Animal {
    void sound() {
        System.out.println("roar");
    }
}

class Cow extends Animal {
    void sound() {
        System.out.println("maa");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("bark");
    }
}

public class AbstractClassExamples {
    public static void main(String[] args) {
//        Animal animal = new Animal(); //animal is a blueprint,
        //cannot create object for abstract class
        Lion lion = new Lion();
        Cow cow = new Cow();
        lion.sound();
        lion.walk();

    }
}
