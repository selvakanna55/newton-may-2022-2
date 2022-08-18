package Assignment;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class DNASequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        TreeMap<String, Integer> hm = new TreeMap<>();
        for (int i = 0; i < n - 9; i++) {
            String curr = s.substring(i, i + 10);
            if (hm.containsKey(curr)) {
                int count = hm.get(curr);
                hm.put(curr, count + 1);
            } else {
                hm.put(curr, 1);
            }
        }
        for (String curr : hm.keySet()) {
            if (hm.get(curr) > 1) {
                System.out.println(curr);
            }
        }

    }
}