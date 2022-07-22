package Assignment;

public class DeleteTheKthNodeFromTheEnd {

    public static Node deleteElement(Node head, int k) {
        Node dummy = new Node(-1);
        dummy.next = head;
        Node p1 = dummy;
        Node p2 = dummy;
        for (int i = 0; i < k; i++) {
            p1 = p1.next;
        }

        while (p1.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        p2.next = p2.next.next;

        return dummy.next;
    }
}
