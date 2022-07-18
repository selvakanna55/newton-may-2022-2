package LinkedList;

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

    public static void main(String[] args) {
        insertAtEnd(10);
        insertAtEnd(20);
        insertAtEnd(30);
        insertAtEnd(40);
        printLL();
    }
}
