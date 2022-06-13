package Assignment;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class TowerOfHanoi {
    static void printTOH(int n, char src, char helper, char dest) {
        if (n == 1) {
            System.out.println(n + ":" + src + "->" + dest);
        } else {
            printTOH(n - 1, src, dest, helper);
            System.out.println(n + ":" + src + "->" + dest);
            printTOH(n - 1, helper, src, dest);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printTOH(n, 'A', 'B', 'C');
    }
}