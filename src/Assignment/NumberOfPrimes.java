package Assignment;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NumberOfPrimes {
    static int n = 100000;
    static boolean isPrime[] = new boolean[n + 1]; // O(n)

    static void primeSeive() {
        for (int i = 0; i <= n; i++) {
            isPrime[i] = true;
        }
        //mark 0 and 1 as not prime
        isPrime[0] = isPrime[1] = false;
        int sqrt = (int) Math.sqrt(n);
        // 2..sqrt(n)
        for (int i = 2; i <= sqrt; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        primeSeive();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int count = 0;
            for (int i = 2; i <= n; i++) {
                if (isPrime[i]) count++;
            }
            System.out.println(count);
        }
    }
}