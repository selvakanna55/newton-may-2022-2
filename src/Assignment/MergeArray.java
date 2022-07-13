package Assignment;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

public class MergeArray {
    //https://www.hackerearth.com/practice/algorithms/sorting/merge-sort/visualize/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int a1[] = new int[n1];
        int a2[] = new int[n2];
        for (int i = 0; i < n1; i++) a1[i] = sc.nextInt();
        for (int i = 0; i < n2; i++) a2[i] = sc.nextInt();

        int result[] = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (a1[i] < a2[j]) {
                //a1[i] smaller
                result[k] = a1[i];
                i++;
            } else {
                result[k] = a2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            result[k] = a1[i];
            i++;
            k++;
        }
        while (j < n2) {
            result[k] = a2[j];
            j++;
            k++;
        }
        //TC: O(n1+n2), SC: O(n1+n2)
        //TC: O(n), SC:O(n)
        for (int z = 0; z < result.length; z++) {
            System.out.print(result[z] + " ");
        }
        System.out.println();
    }
}