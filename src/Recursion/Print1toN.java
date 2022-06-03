package Recursion;

public class Print1toN {
    // print 1 to 5
    static void f(int i, int n){
        if(i>n){
            return;
        }
        System.out.print(i+" ");
        f(i+1, n);
    }
    public static void main(String[] args) {
        System.out.println("Begin");
        int i = 1, n =3;
        f(i, n);
        System.out.println("End");

    }
}

