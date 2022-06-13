package Assignment;

public class PrintPattern {
    static void printPattern(int n, int curr, boolean flag) {

        System.out.print(curr + " ");
        if (!flag && curr == n) {
            return;
        }
        if (curr <= 0) {
            flag = false;
        }
        if (flag) {
            printPattern(n, curr - 5, flag);
        } else {
            printPattern(n, curr + 5, flag);
        }

        // while(curr>0){
        //     System.out.print(curr+" ");
        //     curr-=5;
        // }
        // while(curr!=n){
        //     System.out.print(curr+" ");
        //     curr+=5;
        // }
        // System.out.print(curr+" ");

    }
}
