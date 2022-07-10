package Assignment;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class RemovingDuplicatesFromLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;//given in question
        TreeSet<String> ts = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            ts.add("'" + sc.next() + "'");
        }
        System.out.println(ts);
    }
}