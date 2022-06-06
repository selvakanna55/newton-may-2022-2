package Recusion2;

public class SumOfNumbers {
    public static int sumOfNumbers(int curr, int n){
        if(curr>n){
            return 0;
        }
        int sum = curr + sumOfNumbers(curr+1, n);
        return sum;
    }
    public static void main(String[] args) {
        int n = 3;
        int ans = sumOfNumbers(1, n);
        System.out.println(ans);
    }
}
