package Recusion2;

public class Function {
    public static void printHelper() {
        System.out.println("Hello world");
    }

    public static int sumOfTwoNumber(int num1, int num2) {
        int sumOfTwo = num1 + num2;
        return sumOfTwo;
    }
    public static void main(String[] args) {
        System.out.println("Begin");
        int a = 10;
        int b = 20;
//        int sum = a+b;
        int sum = sumOfTwoNumber(a, b);
        System.out.println(sum);
        System.out.println("End");
    }
}
