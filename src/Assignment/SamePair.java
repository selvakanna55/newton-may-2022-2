package Assignment;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SamePair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        long sum = 0;
        for (int k : hm.keySet()) {
            int freq = hm.get(k); // 3
            sum += ((freq * (freq - 1)) / 2);
        }
        for (int i = 0; i < n; i++) {
            System.out.print((sum - hm.get(arr[i]) + 1) + " ");
        }
    }
}