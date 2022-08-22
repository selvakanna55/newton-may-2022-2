package Assignment;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class PairHate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (st.size() >= 1 && str.charAt(i) == st.peek()) {
                st.pop();
            } else {
                st.push(str.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        System.out.println(st);

        while (!st.empty()) {
            sb.append(st.pop());
        }
        //abcd
        //TC:O(n) SC: O(n)


        System.out.println(sb.reverse());
    }
}