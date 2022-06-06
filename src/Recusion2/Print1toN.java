package Recusion2;

public class Print1toN {
    public static void print1toN(int curr, int n) {
        if (curr > n) {
            return;
        }
        System.out.println(curr);
        //2->3 // curr++
        print1toN(curr+1, n);
        //3, 3
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