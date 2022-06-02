import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows1 = sc.nextInt();
        int cols1 = sc.nextInt();
        int m1[][] = new int[rows1][cols1];
        for (int r = 0; r < rows1; r++) {
            for (int c = 0; c < cols1; c++) {
                m1[r][c] = sc.nextInt();
            }
        }

        int rows2 = sc.nextInt();
        int cols2 = sc.nextInt();
        int m2[][] = new int[rows2][cols2];
        for (int r = 0; r < rows2; r++) {
            for (int c = 0; c < cols2; c++) {
                m2[r][c] = sc.nextInt();
            }
        }

        if (cols1 != rows1) {
            System.out.println("Mat mul cannot be preformed");
        } else {
            int result[][] = new int[rows1][cols2];

            for (int r = 0; r < rows1; r++) {
                for (int c = 0; c < cols2; c++) {
                    for (int k = 0; k < rows2; k++) {
                        result[r][c] = result[r][c] + (m1[r][k] * m2[k][c]);
                    }
                }
            }

            for (int r = 0; r < rows1; r++) {
                for (int c = 0; c < cols2; c++) {
                    System.out.print(result[r][c] + " ");
                }
            }
        }
    }
}
