import java.util.Scanner;

public class ArrayExample2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        //1 D array -> int arr[] = new int[5];
        int arr[][] = new int[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                arr[r][c] = sc.nextInt();
            }
        }

        //[1,2,3]
        //for(int i=0;i<n;i++){
        // System.out.print(arr[i]+" ");
        // }
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                System.out.print(arr[r][c]+" ");
            }
            System.out.println();
        }



    }
}
