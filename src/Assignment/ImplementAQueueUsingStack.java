package Assignment;

import java.util.Stack;

public class ImplementAQueueUsingStack {

    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                int curr = s1.pop();
                s2.push(curr);
            }
        }
        return s2.pop();
    }

    public int peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                int curr = s1.pop();
                s2.push(curr);
            }
        }
        return s2.peek();
    }

    public boolean empty() {
        if (s1.size() == 0 && s2.size() == 0) return true;
        else return false;
    }
}