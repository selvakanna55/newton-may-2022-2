package Assignment;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MohitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        //how to check value is present in array or not
        for (int num = 1; num <= n; num++) {
            boolean present = false;
            //check if num  is present in arry or not?
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] == num) {
                    present = true;
                }
            }
            if (present == false) {
                System.out.println(num);
            }
        }
    }
}