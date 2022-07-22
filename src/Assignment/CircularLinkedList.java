package Assignment;

public class CircularLinkedList {
    public static int check(Node head) {
        int ans = 0; // not circular
        Node run = head;
        while (run != null) {
            //print
            run = run.next;
            if (run == head) {
                ans = 1;
                break;
            }
        }
        return ans;
    }
}
