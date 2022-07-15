package Assignment;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        //arr[i]:i
        for (int i = 0; i < n; i++) {
            hm.put(nums[i], i);
        }

        for (int i = 0; i < n; i++) {
            int x = nums[i];
            int y = target - x;
            if (hm.containsKey(y) == true && hm.get(y) != i) {
                res[0] = i;
                res[1] = hm.get(y);
                break;
            }
        }
        return res;

    }
}
