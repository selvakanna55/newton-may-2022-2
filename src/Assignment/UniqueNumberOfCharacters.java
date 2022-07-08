package Assignment;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


public class UniqueNumberOfCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Character> hs = new HashSet<>();
        String str = sc.nextLine();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);//pick char by char
            hs.add(ch);
        }
        System.out.println(hs.size());
    }
}
