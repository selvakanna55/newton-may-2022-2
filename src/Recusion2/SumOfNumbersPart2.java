package Recusion2;

public class SumOfNumbersPart2 {
    public static int sumOfNumbers(int n){
        if(n<=0){
            return 0;
        }
        int sum = n + sumOfNumbers(n-1);
        return sum;
    }
    public static void main(String[] args) {
        int n = 3;
        int ans = sumOfNumbers(n);
        System.out.println(ans);
        boolean x = true;
        String ans1 = x ? "YES":"NO";
        System.out.println(ans1);
    }

    //last class last 20 mins
    //MLE - sc.nextLine
}
