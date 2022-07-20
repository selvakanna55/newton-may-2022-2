package Assignment;

public class InsertNodeAtTheTail {

    public static Node addElement(Node head, int k) {
        Node temp = new Node(k);
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
        return head;
    }
}
