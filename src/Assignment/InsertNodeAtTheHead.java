package Assignment;

public class InsertNodeAtTheHead {
    public static Node addElement(Node head, int k) {
        Node temp = new Node(k);
        temp.next = head;
        head = temp;
        return head;
    }
}
