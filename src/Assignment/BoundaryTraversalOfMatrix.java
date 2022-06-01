package Assignment;

import java.io.*; // for handling input/output
import java.util.*;

public class BoundaryTraversalOfMatrix {

    // don't change the name of this class
// you can add inner classes if needed
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase > 0) {
            int rows = sc.nextInt();
            int cols = sc.nextInt();
            int arr[][] = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            if (rows == 1) {
                for (int i = 0; i < cols; i++) {
                    System.out.print(arr[0][i] + " ");
                }
            } else if (cols == 1) {
                for (int i = 0; i < rows; i++) {
                    System.out.print(arr[i][0] + " ");
                }
            } else {
                //first row
                for (int i = 0; i < cols; i++) {
                    System.out.print(arr[0][i] + " ");
                }

                //right cols
                for (int i = 1; i < rows - 1; i++) {
                    System.out.print(arr[i][cols - 1] + " ");
                }

                //last rows
                for (int i = cols - 1; i >= 0; i--) {
                    System.out.print(arr[rows - 1][i] + " ");
                }
                //last cols
                for (int i = rows - 2; i >= 1; i--) {
                    System.out.print(arr[i][0] + " ");
                }
            }
            System.out.println();
            testcase--;
        }
    }

}
