package Assignment;

// implement classes here

public class Animal {
    int legs;
    double brainSize;

    Animal(int legs, double brainSize) {
        this.legs = legs;
        this.brainSize = brainSize;
    }

    void sound() {
        System.out.println("which animal sound do you want?");
    }
}
// do i need constructor for lion, goat cow, Elephant  - neded

class Lion extends Animal {
    Lion(int legs, double brainSize) {
        super(legs, brainSize); // call parents class constructor
    }

    void sound() {
        System.out.println("Lion roar!! roar! roar!!");
    }
}


class Goat extends Animal {
    Goat(int legs, double brainSize) {
        super(legs, brainSize);
    }

    void sound() {
        System.out.println("Goat baa! baa! baa!");
    }
}

class Cow extends Animal {
    Cow(int legs, double brainSize) {
        super(legs, brainSize);
    }

    void sound() {
        System.out.println("Cow moo moo");
    }
}

class Elephant extends Animal {
    Elephant(int legs, double brainSize) {
        super(legs, brainSize);
    }

    void sound() {
        System.out.println("Elephant Pawoo! Pawoo!");
    }
}
