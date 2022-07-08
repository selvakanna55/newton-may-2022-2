package Assignment;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


public class CountDuplicates {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            if (tm.containsKey(key)) {
                int freq = tm.get(key);
                tm.put(key, freq + 1);
            } else {
                tm.put(key, 1);
            }
        }

        //iterate
        for (int key : tm.keySet()) {
            //for any num, value is more than 1 -> it is duplicate
            int value = tm.get(key);
            if (value > 1) { // i.e duplicate
                System.out.println(key + " " + value);
            }
        }
    }
}
