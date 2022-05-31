package Assignment;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MaximumAndMinimumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for (int tc = 0; tc < testcase; tc++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int mini = arr[0];
            int maxi = arr[0];
            for (int i = 1; i < n; i++) {
                if (mini > arr[i]) {
                    mini = arr[i];
                }
                if (maxi < arr[i]) {
                    maxi = arr[i];
                }
            }
            System.out.println(maxi + " " + mini);
        }
    }
}