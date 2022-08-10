package oops2;

class Calculator {
    int num1;
    int num2;

    Calculator(int a, int b) {
        num1 = a;
        num2 = b;
    }

    Calculator() {
    }

}

public class CalcExample {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator(10, 20);
    }
}
