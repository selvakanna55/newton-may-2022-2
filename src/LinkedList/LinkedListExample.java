package LinkedList;

import java.util.LinkedList;

class Node {
    int value;
    Node next; //next node, next pointer\

    Node(int nodeValue) {
        value = nodeValue;
    }
}


public class LinkedListExample {
    static Node head = null; // static variable
    //common across fns

    public static void printLL() {
        Node run = head;
        while (run != null) {
            System.out.print(run.value + " ");
            run = run.next;
        }
        System.out.println();
    }

    static void insertAtEnd(int number) {
        // insert number at the end
        //create a node for number
        Node temp = new Node(number);
        if (head == null) {
            head = temp;
        } else {
            Node run = head;
            // do i have any neighbour,
            // if no neighbours, im the last
            while (run.next != null) {
                run = run.next;
            }
            run.next = temp;
        }
    }

    static void insertAtPos(int pos, int val) {
        //pos is valid? how find invalid, len
        Node temp = new Node(val);
        if (pos == 1) {
            temp.next = head;
            head = temp;
        } else {
            Node run = head;
            // stand position before node
            for (int i = 2; i <= pos - 1; i++) {
                run = run.next;
            }
            //temp.next is pointing to next element of run
            //
            temp.next = run.next;
            run.next = temp;
        }
    }

    static void deletePos(int pos) {
        // pos is valid
        if (pos == 1) {
            head = head.next;
        } else {
            Node run = head;
            // stand position before node
            for (int i = 2; i <= pos - 1; i++) {
                run = run.next;
            }
            run.next = run.next.next;
        }
    }

    public static void main(String[] args) {
        insertAtPos(1, 10);
        insertAtPos(2, 20);
        //insert in middle
        insertAtPos(2, 30);
        printLL();
        deletePos(2); //delete 9
        printLL();
        LinkedList<Integer> li= new LinkedList<>();
    }
}
