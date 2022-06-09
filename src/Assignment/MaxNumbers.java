//09-6-2022
package Assignment;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MaxNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        while (tc > 0) {
            int n = Integer.parseInt(sc.nextLine());
            int arr[] = new int[n];
            String temp[] = sc.nextLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(temp[i]);
            }
            int firstMax;
            int secondMax;
            int thirdMax;

            int maxiIndex = 0;
            for (int i = 1; i < n; i++) {
                if (arr[maxiIndex] < arr[i]) {
                    maxiIndex = i;
                }
            }
            firstMax = arr[maxiIndex];
            arr[maxiIndex] = -1;

            maxiIndex = 0;
            for (int i = 1; i < n; i++) {
                if (arr[maxiIndex] < arr[i]) {
                    maxiIndex = i;
                }
            }
            secondMax = arr[maxiIndex];
            arr[maxiIndex] = -1;

            maxiIndex = 0;
            for (int i = 1; i < n; i++) {
                if (arr[maxiIndex] < arr[i]) {
                    maxiIndex = i;
                }
            }
            thirdMax = arr[maxiIndex];
            System.out.println(firstMax + " " + secondMax + " " + thirdMax);
            tc--;
        }
    }
}