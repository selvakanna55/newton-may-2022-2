package arena;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NegativeInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        String ans = "No";
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                ans = "Yes";
                break;
            }
        }
        System.out.println(ans);
    }
}