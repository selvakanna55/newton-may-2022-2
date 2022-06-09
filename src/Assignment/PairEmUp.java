//09-6-2022
package Assignment;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class PairEmUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n = Integer.parseInt(line);
        int arr[] = new int[n];
        String nums = sc.nextLine();
        String temp[] = nums.split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(temp[i]);
        }
        //sort arrya
        Arrays.sort(arr);
        int i = 0, j = n - 1;
        int ans = 0;
        while (i < j) {
            int pairSum = arr[i] + arr[j];
            if (ans < pairSum) {
                ans = pairSum;
            }
            i++;
            j--;
        }
        System.out.println(ans);
    }
}