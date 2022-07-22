package Assignment;

public class InsertionInCircularLinkedList {

    public static Node Insertion(Node head, int K) {
        Node temp = new Node(K);
        Node run = head;
        while (run.next != head) {
            run = run.next;
        }
        run.next = temp;
        temp.next = head;
        return head;
    }
}
