package Assignment;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        while (tc-- > 0) {
            String nums1[] = sc.nextLine().split(" ");
            int n = Integer.parseInt(nums1[0]);
            int k = Integer.parseInt(nums1[1]);
            String nums2[] = sc.nextLine().split(" ");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(nums2[i]);
            }
            HashMap<Long, Integer> hm = new HashMap<>();
            long sum = 0;
            long maxiLen = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
                if (sum == k) maxiLen = i + 1;
                long diff = sum - k;
                if (hm.containsKey(diff)) {
                    int idx = hm.get(diff);
                    int len = i - idx;
                    maxiLen = Math.max(len, maxiLen);
                }
                if (hm.containsKey(sum) == false) {
                    hm.put(sum, i);
                }
            }
            System.out.println(maxiLen);
        }
    }
}