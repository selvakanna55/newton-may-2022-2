package Assignment;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class ChessBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int match = 0;
        for (int r = 0; r < n; r++) {
            String temp[] = sc.nextLine().split(" ");
            for (int c = 0; c < n; c++) {
                int num = Integer.parseInt(temp[c]);
                if (num == ((r + c) % 2)) {
                    match++;
                }
            }
        }
        int notMatch = (n * n) - match;
        System.out.println(Math.min(match, (n * n) - match));
    }
}