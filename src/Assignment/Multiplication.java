package Assignment;

public class Multiplication {
    static int Multiply_by_recursion(int M, int N) {
        if (M == 0) {
            return 0;
        }
        int ans = N + Multiply_by_recursion(M - 1, N);
        return ans;
    }
}
