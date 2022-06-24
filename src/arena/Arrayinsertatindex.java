package arena;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Arrayinsertatindex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int ele = sc.nextInt();
            int idx = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < idx; i++) {
                arr[i] = sc.nextInt();
            }
            arr[idx] = ele;
            for (int i = idx + 1; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}