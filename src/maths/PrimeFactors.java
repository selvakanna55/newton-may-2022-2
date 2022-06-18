package maths;

public class PrimeFactors {
    static void printPrimeFactors(int n){
        //16 -> 2(8) , 2(4)
        while(n%2==0){
            System.out.print(2+" ");
            n = n/2;
        }
        int sqrt = (int)Math.sqrt(n);
        for(int i=3;i<=sqrt;i+=2){//even?
            while(n%i==0){
                System.out.print(i+" ");
                n = n/i;
            }
        }
        if(n>2) //at this point n is a prime number
            System.out.println(n);
        //S: O(1), T:O(sqrt(n)*log(n))
    }
    public static void main(String[] args) {
        int n = 1024;
        printPrimeFactors(n);

    }
}
