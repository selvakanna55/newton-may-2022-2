package arena;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class CountDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int freq[] = new int[100001];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            freq[arr[i]] = freq[arr[i]] + 1;
        }

        for (int i = 0; i < 100001; i++) {
            if (freq[i] > 1) { // i.e duplicate
                System.out.println(i + " " + freq[i]);
            }
        }

    }
}