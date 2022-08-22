package Assignment;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class OptimalGoodies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int j = sc.nextInt();
        int arr[] = new int[n];
        int cost = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        cost = arr[j - 1];
        arr[j - 1] = -1;
        Arrays.sort(arr);
        for (int i = 1; i <= k - 1; i++) {
            cost += arr[i];
        }
        System.out.println(cost);
    }
}