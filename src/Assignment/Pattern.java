package Assignment;

public class Pattern {
    static void Pattern(int N) {
        System.out.println("*");

        for (int row = 1; row <= N - 2; row++) {
            System.out.print("*");

            for (int col = 0; col < row; col++) {
                System.out.print("^");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int row = 0; row <= N; row++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

