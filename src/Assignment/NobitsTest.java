package Assignment;

import java.util.Scanner;

public class NobitsTest {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int Q = sc.nextInt();
        if(Q==0){
            System.out.println(-1);
        }else{
            System.out.println(D/Q);
        }
    }
}
