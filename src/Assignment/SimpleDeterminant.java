package Assignment;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SimpleDeterminant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 2, cols = 2;

        int arr[][] = new int[rows][cols];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                arr[r][c] = sc.nextInt();
            }
        }

        int ans = (arr[0][0] * arr[1][1]) - (arr[1][0] * arr[0][1]);
        System.out.println(ans);
    }
}