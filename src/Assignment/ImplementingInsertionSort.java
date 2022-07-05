package Assignment;

import java.io.*; // for handling input/output
import java.util.*;


public class ImplementingInsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 1; i < n; i++) {
                int hole = i;
                int value = arr[i];
                while (hole > 0 && arr[hole - 1] > value) {
                    arr[hole] = arr[hole - 1];
                    hole--;
                }
                arr[hole] = value;
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            // 1-> TC: O(n2), SC: O(1)
            // t-> TC: O(t*n2) SC: O(t*1)
        }
    }
}
