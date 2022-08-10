package oops2.abstraction;

//class Animal2 {
//    void sound() {
//        System.out.println("aniaml sound");
//    }
//}
//
//class Mammal {
//    void sound() {
//        System.out.println("Mammal sound");
//    }
//}
//
//class Lion2 extends Animal2, Mammal{
//
//}

interface IAnimal {
    void sound();
}

interface IMammal {
    void sound();
}

class Lion2 implements IAnimal, IMammal {
    public void sound() {
        System.out.println("Lion roar!!");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Lion2 l2 = new Lion2();
        l2.sound();
    }
}
