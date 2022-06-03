package Recursion;

public class PrintNto1 {
    // print 1 to 5
    static void f(int i, int n){
        if(i>n){
            return;
        }
        f(i+1, n);
        System.out.print(i+" ");
    }
    public static void main(String[] args) {
        System.out.println("Begin");
        int i = 1, n =3;
        f(i, n);
        System.out.println("End");

    }
}

