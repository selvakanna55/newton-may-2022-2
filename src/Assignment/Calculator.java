package Assignment;

interface CalculatorInterface {
    public int add();

    public int add(int a, int b);

    public int sub();

    public int sub(int a, int b);
}

class Calculator implements CalculatorInterface {
    int num1;
    int num2;

    Calculator(int a, int b) {
        num1 = a;
        num2 = b;
    }

    Calculator() {
    }


    public int add() {
        return num1 + num2;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int sub() {
        return num1 - num2;
    }

    public int sub(int a, int b) {
        return a - b;
    }

}