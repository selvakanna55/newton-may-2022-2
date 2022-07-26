package stacks;

import java.util.Stack;

class ArrayStack {
    int size;
    int stack[];
    int top = -1;

    ArrayStack(int sz) {
        size = sz;
        stack = new int[size];
    }

    //operation
    void push(int val) {//add value
        if (top == size - 1) {
            System.out.println("Stack is full");
        } else {
            top++;
            stack[top] = val;
        }
    }

    void pop() { // deletion - delete the top of the stack
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            top--;
        }
    }

    // next element to be popped
    int peek() { //top -> get the element which in the to[
        int val = -1;
        if (top != -1) val = stack[top];
        return val;
    }
}

public class StackArrayExample1 {

    public static void main(String[] args) {
//        ArrayStack stack = new ArrayStack(3);
        Stack<Integer> stack = new Stack<>();

//        System.out.println(stack.peek()); // 20
//        stack.pop(); // stack is empty
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40); //stack is full
        stack.pop(); // removing 30
        System.out.println(stack.peek()); // 20
        System.out.println(stack);

    }
}
