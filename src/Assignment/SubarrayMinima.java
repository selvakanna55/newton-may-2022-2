package Assignment;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// what all sub arrays, my arr[i] = 3 wil be min?
// don't change the name of this class
// you can add inner classes if needed
class SubarrayMinima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        long nextSmaller[] = new long[n];
        long prevSmaller[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            nextSmaller[i] = n - i - 1;
            prevSmaller[i] = i;
        }

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                nextSmaller[st.peek()] = i - st.pop() - 1;
            }
            st.push(i);
        }
        st.clear();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                prevSmaller[st.peek()] = st.pop() - i - 1;
            }
            st.push(i);
        }
        st.clear();

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += ((nextSmaller[i] + 1) * (prevSmaller[i] + 1) * arr[i]);
        }
        System.out.println(ans);


    }
}
