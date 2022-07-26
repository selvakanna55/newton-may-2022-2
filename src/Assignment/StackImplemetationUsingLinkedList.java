package Assignment;

public class StackImplemetationUsingLinkedList {

    Node top = null;
    Node head = null;

    public void push(int x) {
        //insert at the end
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
    }

    public void pop() {
        if (head != null) head = head.next;
    }

    public void top() {
        if (head == null) System.out.println(0);
        else System.out.println(head.val);
    }
}
