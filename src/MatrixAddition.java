import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // get matrix 1 form user
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int matrix1[][] = new int[r1][c1];
        for(int r=0;r<r1;r++){
            for(int c=0;c<c1;c++){
                matrix1[r][c] = sc.nextInt();
            }
        }
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int matrix2[][] = new int[r2][c2];
        for(int r=0;r<r2;r++) {
            for (int c = 0; c < c2; c++) {
                matrix2[r][c] = sc.nextInt();
            }
        }
        for(int r=0;r<r1;r++){
            for(int c=0;c<c1;c++){
                int ans = matrix1[r][c]+matrix2[r][c];
                System.out.print( ans+" ");
            }
            System.out.println();
        }


    }
}
