package arena;

public class KCircleSum {
    static void kCircleSum(int arr[], int n, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        System.out.print(sum + " ");
        for (int i = 1; i < n; i++) {
            sum = sum - arr[i - 1];
            sum = sum + arr[(i + k - 1) % n];
            System.out.print(sum + " ");
        }
//Enter your code here
    }
}
