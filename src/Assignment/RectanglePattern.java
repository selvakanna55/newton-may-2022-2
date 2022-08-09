package Assignment;


import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class RectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }


        System.out.println();
        for (int i = 1; i <= m - 2; i++) {
            System.out.print("*");
            for (int j = 1; j <= n - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }


        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }


    }
}