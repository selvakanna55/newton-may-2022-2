//10/06/2022
package Recall;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                arr[r][c] = sc.nextInt();
            }
        }

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }


//        int n = Integer.parseInt(sc.nextLine());
//        System.out.println(n);
        System.out.println(Math.min(10, 15));
        System.out.println(Math.max(10, 15));

    }
}
