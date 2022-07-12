package Assignment;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class RevStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        String result = sb.toString(); //StringBuilder -> String
        System.out.println(result);
    }
}