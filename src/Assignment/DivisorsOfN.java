package Assignment;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class DivisorsOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int count = 0;
            int sqrt = (int) Math.sqrt(n);
            for (int i = 1; i <= sqrt; i++) {
                if (n % i == 0) {
                    //i is divior
                    // if(i%2==0){count++;}
                    System.out.println(i);
                    if (n / i != i) {//sqrt number
                        //n/i is divisor
                        System.out.println(n / i);
                        // if((n/i)%2==0){count++;}
                    }
                }
            }
            // System.out.println(count);
        }
        // Your code here
    }
}
