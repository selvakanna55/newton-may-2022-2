package Assignment;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class InsertOperator {
    public static boolean isKRechable(long sum, long k, long arr[], int idx) {
        if (idx == arr.length) {
            if (sum == k) return true;
            else return false;
        }
        boolean add = isKRechable(sum + arr[idx], k, arr, idx + 1); // f(n-1)
        boolean sub = isKRechable(sum - arr[idx], k, arr, idx + 1); // f(n-2)
        return add || sub; // f(n-1)+f(n-2)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextLong();
        if (isKRechable(arr[0], k, arr, 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}