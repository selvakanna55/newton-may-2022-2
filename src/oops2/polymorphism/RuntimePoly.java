package oops2.polymorphism;

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Lion extends Animal {
    void eat() {
        System.out.println("Lion is eating");
    }
}


class Tiger extends Animal {
    void eat() {
        System.out.println("Tiger is eating");
    }
}

public class RuntimePoly {
    public static void main(String[] args) {
        Animal animal = new Lion();
        animal.eat();

        Animal animal1 = new Tiger();
        animal1.eat();
    }
}
