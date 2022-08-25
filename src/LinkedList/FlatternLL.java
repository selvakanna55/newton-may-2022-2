package LinkedList;

class NodeFlat {
    int val;
    NodeFlat next; 
    NodeFlat bottom;

    NodeFlat(int val) {
        this.val = val;
    }
}

public class FlatternLL {
    static NodeFlat head = null;

    static void insert(int arr[]) {
        NodeFlat currNodeFlat = new NodeFlat(arr[0]);
        NodeFlat prev = currNodeFlat;
        for (int i = 1; i < arr.length; i++) {
            prev.bottom = new NodeFlat(arr[i]);
            prev = prev.bottom;
        }
        if (head == null) {
            head = currNodeFlat;
        } else {
            NodeFlat curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = currNodeFlat;
        }
    }

    static void print() {
        NodeFlat curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            NodeFlat bellowNodeFlat = curr.bottom;
            while (bellowNodeFlat != null) {
                System.out.print(bellowNodeFlat.val + " ");
                bellowNodeFlat = bellowNodeFlat.bottom;
            }
            System.out.println();
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        insert(new int[]{5, 7, 8, 30});
        insert(new int[]{10, 20});
        insert(new int[]{19, 22, 50});
        insert(new int[]{28, 25, 40, 45});
        print();
    }
}
//
//
//
//3)Reverse alternate nodes in Link List  -- not solved , Syntax Errors
//        Linked List = 10->4->9->1->3->5->9->4
//        Given a linked list, you have to perform the following task:
//        Extract the alternative nodes starting from second node.
//        Reverse the extracted list.
//        Append the extracted list at the end of the original list.
//        4 ,1,5,4 are alternative nodes
//
//        o/p: 10-->9-->3-->9-->4-->5-->1-->4-->null
//        -- not solved


//this is  question 1,1,1,2,2,3,3,3,4,4 is binary search num =1 and output 0 plz solve this question


