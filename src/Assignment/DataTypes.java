package Assignment;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long l = sc.nextLong();
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        char ch = sc.next().charAt(0);
        System.out.println(n);
        System.out.println(l);
        System.out.printf("%.2f", f);
        System.out.println();
        System.out.printf("%.4f", d);
        System.out.println();
        System.out.println(ch);
    }
}
