package Assignment;

interface Adder {
    public int add();

    public int add(int a, int b);

    public int add(int a, int b, int c);
}

// implement you interface here
class AdderII implements Adder {
    public int num1;
    public int num2;

    AdderII() {
        num1 = 0;
        num2 = 0;
    }

    AdderII(int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }

    public int add() {
        return num1 + num2;
    }

    public int add(int a, int b) {
        return (a * a) + (b * b);
    }

    public int add(int a, int b, int c) {
        num1 = add(num1, a);

        num2 = add(num2, b);

        return (num1 + num2 - c * c);

        // return (num1*a)+(num2*b) - (c*c);
    }
}