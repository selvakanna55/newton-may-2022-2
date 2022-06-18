package Assignment;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MaximumDifferenceArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxDiff = -1;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(arr[j]>arr[i]){
        //             int diff = j-i;
        //             if(maxDiff<diff){
        //                 maxDiff = diff;
        //             }
        //         }
        //     }
        // }

        int[] maxArray = new int[n];
        maxArray[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxArray[i] = Math.max(arr[i], maxArray[i + 1]);
        }

        int i = 0, j = 0;
        while (i < n && j < n) {
            if (arr[i] < maxArray[j]) {
                int diff = j - i;
                if (maxDiff < diff) {
                    maxDiff = diff;
                }
                j++;
            } else {
                i++;
            }
        }
        //TC: O(n)
        //SC: O(n)
        System.out.println(maxDiff);
    }
}