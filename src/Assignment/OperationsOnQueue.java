package Assignment;

import java.util.Queue;

public class OperationsOnQueue {
    // enqueue():- that takes the queue
// and the integer to be added as a parameter.
    public static void enqueue(Queue<Integer> qu, int x) {
        qu.add(x);
    }

    // dequeue():- that takes the queue as parameter.
    public static void dequeue(Queue<Integer> qu) {
        if (qu.isEmpty() == false) {
            qu.remove(); //delete
        }
        //enter your code here
    }

    // displayfront():-  that takes the queue as parameter.
    public static void displayfront(Queue<Integer> qu) // peek
    {
        if (qu.isEmpty() == false) {
            System.out.println(qu.peek());
        } else {
            System.out.println(0);
        }
        // enter your code here
    }
}
