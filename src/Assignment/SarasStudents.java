package Assignment;

public class SarasStudents {
    public static int maxChocolates(Node head) {
        Node slow = head, fast = head, prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        // slow = 3, prev = 5, fast = null
        prev.next = null;


        Node firstHalf = head;
        Node secondHalf = slow;
        // code to rev list
        prev = null;
        Node curr = secondHalf;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        int maxi = 0;
        secondHalf = prev;
        while (firstHalf != null && secondHalf != null) {
            maxi = Math.max(firstHalf.val + secondHalf.val, maxi);
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return maxi;
        // System.out.println(maxi);
    }
}
