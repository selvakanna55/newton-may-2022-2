package oops2.polymorphism;

public class CompileTime {
    static int sum(int a, int b) {
        System.out.println("2 args int function is called");
        return a + b;
    }

    static double sum(double a, double b) {
        System.out.println("2 args double function is called");
        return a + b;
    }

    static double sum(int a, double b) {
        System.out.println("2 args double function is called");
        return a + b;
    }

    static int sum(int a, int b, int c) {
        System.out.println("3 args int function is called");
        return a + b + c;
    }

    static int sum(int a, int b, int c, int d) {
        System.out.println("4 args int function is called");
        return a + b + c + d;
    }


    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20.9));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));
        System.out.println(sum(10.0, 5.1));
    }
}
