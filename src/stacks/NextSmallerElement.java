package stacks;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args) {
        int arr[] = {2, 8, 9, 7, 8, 3, 6, 1};
        int n = arr.length;
        //           1  7  7  3  3   1  1 -1
        //what is next smallest element
        int nextSmallest[] = new int[n];
        Arrays.fill(nextSmallest, -1);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                nextSmallest[st.pop()] = arr[i];
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(nextSmallest));


    }
}
