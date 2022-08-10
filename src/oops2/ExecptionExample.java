package oops2;

import java.util.Scanner;

public class ExecptionExample {
    public static void main(String[] args) {
        System.out.println("Begin the of the program");

        //exception  - unusual things that stops the program abruptly
//        // runtime error
        Scanner sc = new Scanner(System.in);
        Scanner m = null;
        m.nextInt();
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        if (b == 0) {
//            System.out.println("B cannot be 0");
//        } else {
//            int div = a / b;
//            System.out.println(div);
//        }

        int arr[] = {10, 20, 30};
        try {
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("B cannot be 0");
        }
        System.out.println("End the of the program");
    }
}

//throw throws throwable
