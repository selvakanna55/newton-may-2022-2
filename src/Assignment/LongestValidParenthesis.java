package Assignment;


import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class LongestValidParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int maxi = 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') st.push(i);
            else {
                st.pop();
                if (st.empty()) st.push(i);
                else maxi = Math.max(maxi, i - st.peek());
            }
        }
        System.out.println(maxi);
    }
}