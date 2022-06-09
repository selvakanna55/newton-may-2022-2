//09-6-2022
package Assignment;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class HipHipArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n = Integer.parseInt(line);
        int arr[] = new int[n];
        String nums = sc.nextLine();
        String temp[] = nums.split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(temp[i]);
        }
        long sum = 0;
        long product = 1;
        if (n % 2 == 0) {
            //even
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    sum += arr[i];
                } else {
                    product *= arr[i];
                }
            }
        } else {
            //odd
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    product *= arr[i];
                } else {
                    sum += arr[i];
                }
            }
        }
        System.out.println(sum + " " + product);
    }
}