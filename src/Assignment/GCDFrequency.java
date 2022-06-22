package Assignment;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class GCDFrequency {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int freq[] = new int[100001];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[i] = num;
            freq[num] = freq[num] + 1;
        }
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + gcd(arr[i], freq[arr[i]]);
        }
        System.out.println(sum);
    }
}

