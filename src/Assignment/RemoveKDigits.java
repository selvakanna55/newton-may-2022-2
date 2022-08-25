package Assignment;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class RemoveKDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            while (k > 0 && !st.empty() && st.peek() > ch) {
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while (!st.empty() && k > 0) {
            st.pop();
            k--;
        }
        int n = st.size(); //3
        char arr[] = new char[n];
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = st.pop();
        }

        int i = 0;
        // remove trailing zeros
        while (i < n && arr[i] == '0') i++; // 2

        String ans = String.valueOf(arr);
        if (i == n) ans = "0";
        else ans = ans.substring(i, n); // n-1
        System.out.println(ans);
    }
}