package Assignment;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class GroupOfNumbers {
    public static void main(String[] args) {
        //re arrage the numbers based on freq
        HashMap<Integer, Integer> hm = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 2 2 2 3 3 1
        // 1 2 3
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        // sort hashmap keys based on values
        // {1=1, 2=3, 3=2}
        //key all keys = [1,2,3] hm.keySet()
        ArrayList<Integer> li = new ArrayList<>(hm.keySet());
        // convert hashset into arraylist
        Collections.sort(li, (a, b) -> {
            //a - 2, b = 3
            if (hm.get(a) == hm.get(b) && a < b) {
                return 1; // any positive integer
            } else if (hm.get(a) < hm.get(b)) {
                return 1;
            } else return -1;
        });
        // System.out.println(hm);
        // System.out.println(li);
        for (int i : li) {
            System.out.print(i + " ");
        }
    }
}