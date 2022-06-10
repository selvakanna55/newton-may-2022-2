//10/06/2022
package Assignment;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class ABooleanMatrixProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        for (int t = 0; t < tc; t++) {
            String line = sc.nextLine(); //"5 4"
            String temp[] = line.split(" "); //"5 4" -> ["5", "4"]
            int rows = Integer.parseInt(temp[0]);//5
            int cols = Integer.parseInt(temp[1]);//4
            int arr[][] = new int[rows][cols];
            for (int r = 0; r < rows; r++) {
                line = sc.nextLine();//"1 0 0 0"
                String temp1[] = line.split(" "); //["1","0","0","0"]
                int number = 0;//added
                for (int c = 0; c < cols; c++) {
                    arr[r][c] = Integer.parseInt(temp1[c]);
                    if (arr[r][c] == 1) {
                        number = 1;
                        break;
                    }
                }
                for (int i = 0; i < cols; i++) {
                    System.out.print(number + " ");
                }
                System.out.println();
            }
        }

    }
}