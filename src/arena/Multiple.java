package arena;

public class Multiple {
    static int[] countOfNumbers(int A[], int n) {
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (A[j] % A[i] == 0) {
                    ans[i]++;
                }
            }
        }
        return ans;
        //Enter your code here
    }
}
