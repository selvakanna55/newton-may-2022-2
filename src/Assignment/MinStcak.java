package Assignment;


import java.util.*;

class MinStack {
    Stack<int[]> st;

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int val) {
        if (st.isEmpty()) {
            st.push(new int[]{val, val});
        } else {
            st.push(new int[]{val, Math.min(val, st.peek()[1])});
        }
    }

    public void pop() {
        if (!st.isEmpty()) st.pop();
    }

    public int top() {
        return st.peek()[0];
    }

    public int getMin() { // get min -> O(1), O(n)
        return st.peek()[1];
    }
}

/**
 * //middle element from a stack in O(1) ? interview question
 * <p>
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
