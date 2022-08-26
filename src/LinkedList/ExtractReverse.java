package LinkedList;

public class ExtractReverse {
    static Node extractAndReverse(Node head) {
        //10->4->9->1->3->5->9->4
        Node head1 = new Node(-1);
        Node head2 = new Node(-1);
        Node l1 = head1, l2 = head2;
        int i = 0;
        Node curr = head;
        while (curr != null) {
            if (i % 2 == 0) {
                l1.next = curr;
                l1 = l1.next;
            } else {
                l2.next = curr;
                l2 = l2.next;
            }
            i++;
            curr = curr.next;
        }
        l1.next = null;
        //remove dummy
        head1 = head1.next;
        head2 = head2.next;

        //rev
        Node prev = null;
        curr = head2;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        l1.next = prev;
        return head1;
    }

    //extra  O(n) -> stacks

    public static void main(String[] args) {
        LinkedListExample li = new LinkedListExample();
        li.insertAtEnd(10);
        li.insertAtEnd(4);
        li.insertAtEnd(9);
        li.insertAtEnd(1);
        li.insertAtEnd(3);
        li.insertAtEnd(5);
        li.insertAtEnd(9);
        li.insertAtEnd(4);
        li.printLL();

        li.head = extractAndReverse(li.head);
        li.printLL();
        ;

    }
}
