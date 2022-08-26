package Assignment;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class LongestUniqueCharactersSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int left = 0;
        int right = 0;
        int n = str.length();
        int len = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (right < n) {
            if (map.containsKey(str.charAt(right)))
                left = Math.max(left, map.get(str.charAt(right)) + 1);
            map.put(str.charAt(right), right);
            len = Math.max(len, right - left + 1);
            right++;
        }


        System.out.print(len);
    }
}