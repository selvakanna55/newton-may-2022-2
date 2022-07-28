package stacks;

import java.util.Stack;

public class IsValidBracket {
    static boolean isValid(String bracket) {
        Stack<Character> st = new Stack<>();
        int n = bracket.length();
        for (int i = 0; i < n; i++) {
            char ch = bracket.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                if (st.isEmpty()) return false;
                st.pop();
            }
        }
        if (st.isEmpty()) return true;
        else return false;
    }

    public static void main(String[] args) {
        String s = "(())";
        System.out.println(isValid(s));
    }
}
