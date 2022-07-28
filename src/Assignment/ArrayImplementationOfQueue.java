package Assignment;

public class ArrayImplementationOfQueue {
    static final int MAX = 10000;
    static int rear = 0, front = 0;
    static int a[];

    ArrayImplementationOfQueue() {
        a = new int[MAX];
    }


    public static void enqueue(int x, int k) {
        if (rear == k) {
            System.out.println("Queue is full");
        } else {
            a[rear] = x;
            rear++;
        }
    }


    public static void dequeue() {
        if (rear == front) {
            System.out.println("Queue is empty");
        } else {
            front++;
        }
    }

    public static void displayfront() {
        if (rear == front) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(a[front]);
        }

        // enter your code here
    }
}

