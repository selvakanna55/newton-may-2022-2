package Collections;

import java.util.Scanner;
import java.util.TreeSet;

public class PrintUniqueElemensys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeSet<Integer> ts = new TreeSet<>(); //logn
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            ts.add(num);
        }
        System.out.println(ts);
    }
}


//
//
//
//
//
//    public static ArrayList ret3() {
//        ArrayList li = new ArrayList<>();
//        return li;
//    }
//
//    public static ArrayList<Integer> ret2() {
//        ArrayList<Integer> li = new ArrayList<>();
//        return li;
//    }
//
//    public static int[] ret1() {
//        int arr[] = new int[5];
//        return arr;
//    }