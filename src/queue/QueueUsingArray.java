package queue;


import java.util.LinkedList;
import java.util.Queue;

class QueueArray {
    int size;
    int arr[];
    int front = -1;
    int rear = -1;

    QueueArray(int sz) {
        size = sz;
        arr = new int[size];
    }

    void enqueue(int num) {
        // add an element into q - stand in the q line
        if (rear == size - 1) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) front++;
            rear++;
            arr[rear] = num;
        }
    }


    void dequeue() {
        //remove an element from q - issue ticket
        if (front > rear || front == -1) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("removing element: " + arr[front]);
            front++;
        }
    }

    int peek() {
        //next element to be removed
        if (front > rear || front == -1) {
            System.out.println("Queue is empty");
            return -1; // q is empty
        } else {
            return arr[front];
        }
    }
}

public class QueueUsingArray {
    public static void main(String[] args) {
//        QueueArray q = new QueueArray(3);
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.remove(); // pop - 10
        System.out.println(q.peek());


//        q.enqueue(10);
//        q.enqueue(20);
//        q.enqueue(30);
//        q.enqueue(40); // queue is full
//        System.out.println(q.peek()); //10
//        q.dequeue(); // 10
//        System.out.println(q.peek()); //20
//        q.dequeue(); // 20
//        q.dequeue(); // 30
//        q.dequeue(); // queue is empty
//        System.out.println(q.peek()); //-1
    }
}

