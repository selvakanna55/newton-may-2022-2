package Assignment;

import java.util.Scanner;

public class SumOfMinimumAndMaximumElementsOfSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long sum = 0;
        for (int i = 0; i <= n - k; i++) {
            int maxi = arr[i];
            int mini = arr[i];
            for (int j = i + 1; j < i + k; j++) {
                maxi = Math.max(maxi, arr[j]);
                mini = Math.min(mini, arr[j]);
            }
            sum += maxi + mini;
        }
        System.out.println(sum);
    }
}
