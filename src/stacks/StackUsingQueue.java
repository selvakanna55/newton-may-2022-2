package stacks;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackUsingQueue {
    static Queue<Integer> q = new ArrayDeque<>();

    static void push(int num) {
        q.add(num);
    }

    static void pop() {
        int sz = q.size();
        while (sz > 1) {
            q.add(q.remove());
            sz--;
        }
        q.remove();
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        System.out.println(q);
        pop();
        System.out.println(q);
    }
}
