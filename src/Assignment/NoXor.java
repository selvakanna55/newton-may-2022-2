package Assignment;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NoXor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long sum = 0;
        for (int i = 1; i <= N; i++) {
            long num = sc.nextInt();
            sum = sum + ((N - i) ^ num);
        }
        System.out.println(sum);

    }
}