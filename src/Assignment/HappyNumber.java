package Assignment;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class HappyNumber {
    public static int getDigitSquareSum(int num) {
        int squreSum = 0;
        while (num > 0) {
            int currDigit = num % 10;
            squreSum += currDigit * currDigit;
            num = num / 10;
        }
        return squreSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> hs = new HashSet<Integer>();
        while (n != 1 && hs.contains(n) == false) {
            hs.add(n);
            n = getDigitSquareSum(n);
            System.out.println(n);
        }
        if (n == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}