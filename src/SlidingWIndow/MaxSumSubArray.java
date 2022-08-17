package SlidingWIndow;

import jdk.nashorn.internal.ir.IdentNode;

import java.util.HashMap;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 2, -7, 4};
        int n = arr.length;

        int maxi = Integer.MIN_VALUE, sum = 0;
        int start = 0, end = 0, nextStart = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if (sum < 0) {
                nextStart = i + 1;
                sum = 0;
            }
            if (maxi < sum) {
                maxi = sum;
                start = nextStart;
                end = i;
            }
        }
        System.out.println(maxi);
        System.out.println(start + " " + end);
    }
}
