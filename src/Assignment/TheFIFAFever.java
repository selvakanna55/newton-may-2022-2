package Assignment;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class TheFIFAFever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for (int t = 0; t < testcases; t++) {
            int n = sc.nextInt();
            int prev = -1;
            int curr = sc.nextInt();
            for (int i = 0; i < n; i++) {
                String operation = sc.next();
                if (operation.equals("P")) {
                    prev = curr;
                    curr = sc.nextInt();
                } else { //B
                    int temp = curr;
                    curr = prev;
                    prev = temp;
                }
            }
            System.out.println(curr);
        }
    }
}