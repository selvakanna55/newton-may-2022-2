package Assignment;

import java.util.Scanner;

public class ZeroWindowSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0, ans = -1, windowNo = 1;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        if (sum != 0) {
            for (int i = k; i < n; i++) {
                windowNo++;
                sum += arr[i];
                sum -= arr[i - k];
                if (sum == 0) {
                    ans = windowNo;
                    break;
                }
            }
        } else {
            ans = 1;
        }
        System.out.println(ans);
    }
}
