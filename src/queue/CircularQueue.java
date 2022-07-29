package queue;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

class CircularArray {
    int front = -1, rear = -1;
    int capacity = 0, length = 0;
    //length - how many elements are actually in the queue
    //capacity -> maximum number of elements can be added into the queue
    int arr[];

    CircularArray(int sz) {
        capacity = sz;
        arr = new int[capacity];
    }

    void enqueue(int num) {
        if (length == capacity) {//new
            System.out.println("Queue is full");
        } else {
            length++; //new
            if (front == -1) front++;
            rear++;
            arr[rear] = num;
            if (rear == capacity - 1) { //new
                rear = -1;
            }
        }
    }

    void dequeue() {
        if (length == 0) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("removing element: " + arr[front]);
            front++;
            if (front == capacity) {
                front = 0;
            }
            length--;
        }
    }

    void peek() {
        if (length == 0) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(arr[front]);
        }
    }
}

public class CircularQueue {
    public static void main(String[] args) {
//        CircularArray cq = new CircularArray(3);
//        cq.enqueue(10);
//        cq.enqueue(20);
//        cq.enqueue(30);
//        cq.dequeue();
//        cq.enqueue(40);
//        cq.dequeue();
//        cq.enqueue(50);
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(10);
        dq.add(20);
        dq.addFirst(30);
        dq.addLast(40);
        dq.removeFirst();
        dq.removeLast();
    }
}
