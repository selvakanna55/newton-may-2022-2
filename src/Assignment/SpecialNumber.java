package Assignment;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SpecialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        long sum = 0;
        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            int currDigit = ch - '0';
            sum += currDigit;
        }
        // System.out.println(sum);
        if (sum % 3 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}