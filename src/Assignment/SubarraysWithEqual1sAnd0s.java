package Assignment;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SubarraysWithEqual1sAnd0s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int k = 0;
        String nums2[] = sc.nextLine().split(" ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(nums2[i]);
            if (arr[i] == 0) arr[i] = -1;
        }
        HashMap<Long, Integer> hm = new HashMap<>();
        long sum = 0;
        long eqZeroOnes = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0) eqZeroOnes++;
            if (hm.containsKey(sum)) {
                eqZeroOnes += hm.get(sum);
                hm.put(sum, hm.get(sum) + 1);
            } else {
                hm.put(sum, 1);
            }
        }
        System.out.println(eqZeroOnes);
    }
}