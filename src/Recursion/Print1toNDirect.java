package Recursion;

public class Print1toNDirect {
    // print 5 to 1
    static void f(int n){
        if(n<1){
            return;
        }
        System.out.print(n+" ");
        f( n-1);
    }
    public static void main(String[] args) {
        System.out.println("Begin");
        int n =3;
        f(n);
        System.out.println("End");

    }
}

