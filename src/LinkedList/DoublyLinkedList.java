package LinkedList;

class NodeDLL {
    int value;
    NodeDLL next; //next node, next pointer
    NodeDLL prev; //prev node, prev pointer

    NodeDLL(int nodeValue) {
        // constructor - initialize  when obj is created
        value = nodeValue;
    }
}

public class DoublyLinkedList {
    static NodeDLL head = null; // static variable

    static void insertAtEnd(int number) {
        NodeDLL temp = new NodeDLL(number);
        if (head == null) {
            head = temp;
        } else {
            NodeDLL run = head;
            while (run.next != null) {
                run = run.next;
            }
            run.next = temp;
            temp.prev = run; // added -> point to prev node
        }
    }

    public static void printLL() {
        NodeDLL run = head;
        while (run != null) {
            System.out.print(run.value + " ");
            run = run.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        insertAtEnd(10);
        insertAtEnd(20);
        insertAtEnd(30);
        insertAtEnd(40);
        printLL();
    }
}
