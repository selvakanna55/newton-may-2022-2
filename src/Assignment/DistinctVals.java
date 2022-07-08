package Assignment;

import java.util.HashSet;
import java.util.Scanner;

public class DistinctVals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            hs.add(num);
        }
        System.out.println(n - hs.size());
    }
}
