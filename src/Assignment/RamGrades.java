package Assignment;

import java.util.Scanner;

public class RamGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int sum = a + b + c + d;
        System.out.println((sum * 100) / 400);
    }
}
