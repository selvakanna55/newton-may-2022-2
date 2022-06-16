package Assignment;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Checkifprime {
    static public boolean isPrimeSqrt(int n) {
        if (n < 2) return false;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {//7%6==1
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            if (isPrimeSqrt(n)) { //true
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}