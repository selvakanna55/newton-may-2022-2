package arena;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Arrayinsertatend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int ele = sc.nextInt();
            int arr[] = new int[n + 1];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            arr[n] = ele;
            for (int i = 0; i < n + 1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}