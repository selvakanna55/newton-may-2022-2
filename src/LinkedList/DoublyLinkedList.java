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

    static void insertAtPos(int pos, int val) {
        //pos is valid? how find invalid, len
        NodeDLL temp = new NodeDLL(val);
        if (pos == 1) {
            temp.next = head;
            head = temp;
            //
        } else {
            NodeDLL run = head;
            for (int i = 2; i <= pos - 1; i++) {
                run = run.next;
            }
            temp.next = run.next;
            run.next = temp;
            temp.prev = run;
            if (temp.next != null) {
                temp.next.prev = temp;
            }
        }
    }

    public static void main(String[] args) {
        insertAtPos(1, 10);
        insertAtPos(2, 20);
        insertAtPos(3, 30);
        insertAtPos(3, 40);
        printLL();
    }
}
