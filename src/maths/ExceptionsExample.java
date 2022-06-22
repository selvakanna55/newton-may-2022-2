package maths;

public class ExceptionsExample {
    public static void main(String[] args) {
        int a = 10, b = 0;
        if (b != 0) {
            int c = a / b;
            System.out.println(c);
        } else {
            System.out.println("B cannot be zero");
        }

        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("B cannot be zero");
        }
    }
}

