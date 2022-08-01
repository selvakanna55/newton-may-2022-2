package oops2;
//without static:
//200
//1200
//200

//static -> global
//shared between all objects
//

class SimpleMath {
    static int a; // a is static variable
    int b; // b is instance variable
    final double pi = 3.14; //constant

    SimpleMath(int _a, int _b) {
        a = _a;
        b = _b;
    }

    void printMul() {
        System.out.println(a * b);
    }

    static void printMe() {
        System.out.println("okok");
    }
}

public class StaticExample {
    public static void main(String[] args) {
        SimpleMath m1 = new SimpleMath(10, 20);
        m1.printMul(); //200
        System.out.println(SimpleMath.a); // a is static
        SimpleMath.printMe(); // printMe is static
        SimpleMath.a = 100;
        m1.printMul(); //2000

    }
}
