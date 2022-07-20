package Assignment;

public class DeleteTheMiddleOfTheLinkedList {
    public static Node deleteMiddleElement(Node head) {
        //find the middle
        // when only one ndoe is give
        if (head.next == null) {
            head.val = -1;
            return head;
        }

        Node slow = head, fast = head;
        Node prev = null;
        while (fast != null && fast.next != null) {
            prev = slow; // last slow
            slow = slow.next; //by1
            fast = fast.next.next; // by 2t
        }
        //slow is the middle
        prev.next = prev.next.next;
        return head;
    }
}
