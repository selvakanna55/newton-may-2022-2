package maths;

import java.lang.Math;
import java.util.Scanner;

public class FactorsDivisors {
    public static void main(String[] args) {
        int n = 15;
//        for(int i=1;i<=n;i++){
//            if(n%i==0){ //when rem is 0, it is divisble
//                System.out.println(i);
//            }
//        }
        //T: O(n), S:O(1)


        int sqrt = (int) Math.sqrt(n);//6.0->6 // 48 - 3.95 -> 3
        System.out.println("sqrt of n"+sqrt);
        //(int)10.0
        for (int i = 0; i <= sqrt; i++) {
            if (n % i == 0) { //when rem is 0, it is divisble //1false
                System.out.println(i);
//                if (i * i != n) {
                if (n/i!=i) { //15/3!=3 -> 5!=3
                    System.out.println(n / i); //36/3
                }
            }
        }
        //O(sqrt(n))

    }
}
