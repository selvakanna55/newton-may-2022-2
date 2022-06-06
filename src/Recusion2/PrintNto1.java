package Recusion2;

public class PrintNto1 {

    public static void print1toN(int curr, int n) {
        if (curr > n) { //count>3
            return;
        }
        print1toN(curr + 1, n);
        System.out.println(curr);
    }

    public static void main(String[] args) {
        print1toN(1, 3);
    }
}


//
//    int n = 5; // loop
//        for(int i=1;i<=n;i++){
//                System.out.print(i+" ");
//                }
