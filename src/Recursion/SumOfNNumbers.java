package Recursion;

public class SumOfNNumbers {
    static int sumOfNumbers(int n) {
        if (n <= 0) {
            return 0;
        }
        int sum = n + sumOfNumbers(n - 1);
        return sum;
    }

    public static void main(String[] args) {
        int n = 10;
        int sum = sumOfNumbers(n);
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