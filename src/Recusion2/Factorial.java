package Recusion2;

public class Factorial {
    public static int factorial(int n){
        if(n<=1){
            return 1;
        }
        int factTillN = n * factorial(n-1);
        return factTillN;
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = factorial(n);
        System.out.println(ans);
    }
}
