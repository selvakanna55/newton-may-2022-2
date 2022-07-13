package Assignment;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Flames {
    public static void main(String[] args) {
        //delete common chars
        // s1.length() + s2.length()
        //sum%6 = 0
        //how to strike out common
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int count1[] = new int[26];
        int count2[] = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            int idx = s1.charAt(i) - 'a';
            count1[idx] = count1[idx] + 1;
        }
        for (int i = 0; i < s2.length(); i++) {
            int idx = s2.charAt(i) - 'a';
            count2[idx] = count2[idx] + 1;
        }

        int len = 0;
        for (int i = 0; i < 26; i++) {
            int diff = Math.abs(count1[i] - count2[i]);
            len = len + diff;
        }


        String relation[] = {"Siblings", "Friends", "Love", "Affection", "Marriage", "Enemy"};
        System.out.println(relation[len % 6]);


    }
}