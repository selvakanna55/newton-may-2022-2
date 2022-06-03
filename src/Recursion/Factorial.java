package Recursion;

public class Factorial {
    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        int fact = n * factorial(n - 1);
        return fact;
    }

    public static void main(String[] args) {
        int n = 5;
        int sum = factorial(n);
        System.out.println(sum);
    }
}


//
//    int n = 5;
//    int sum = 0;
//        for (int i = 1; i <= n; i++) {
//                sum = sum + i;
//                }
//                System.out.println(sum);