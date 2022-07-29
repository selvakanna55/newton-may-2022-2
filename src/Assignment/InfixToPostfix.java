package Assignment;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
    static int getPrecedence(char ch) {
        if (ch == '^') return 3;
        else if (ch == '/' || ch == '*') return 2;
        else if (ch == '+' || ch == '-') return 1;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> st = new Stack<>();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ans += ch;
            } else if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans += st.pop();
                }
                st.pop(); //remove then open bracket
            } else {
                while (!st.isEmpty() && getPrecedence(ch) <= getPrecedence(st.peek())) {
                    ans += st.pop();
                }
                st.push(ch);
            }
        }
        while (!st.isEmpty()) {
            ans += st.pop();
        }
        System.out.println(ans);
    }
}
