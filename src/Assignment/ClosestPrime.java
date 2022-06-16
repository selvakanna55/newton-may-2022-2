package Assignment;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class ClosestPrime {
    static boolean prime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (prime(n)) {
            System.out.println(n);
        } else {
            int i = n - 1, j = n + 1;
            for (; ; ) {
                if (prime(i)) {
                    System.out.println(i);
                    break;
                } else if (prime(j)) {
                    System.out.println(j);
                    break;
                }
                i--;
                j++;
            }
        }


    }


}
