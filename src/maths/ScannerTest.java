package maths;

import java.util.Scanner;

public class ScannerTest {
    static void f(Scanner sc){
        int n = sc.nextInt();
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
        f(sc);
    }
}
