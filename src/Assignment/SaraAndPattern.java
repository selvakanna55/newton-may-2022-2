package Assignment;

public class SaraAndPattern {
    static void Pattern(int N) {
        for (int row = 0; row < N; row++) {
            int num = row * 6;
            for (int col = 0; col < N; col++) {
                System.out.print(num + " ");
                num = num + 4;
            }
            System.out.println();
        }
    }
}
