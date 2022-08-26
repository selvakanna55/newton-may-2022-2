package Assignment;


import java.util.*;

class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int result[] = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) { // 4-3 =1
                dq.pollFirst();
            }
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) { // 4-3 =1
                dq.pollLast();
            }

            dq.offer(i);
            if (i >= k - 1) {
                result[i - (k - 1)] = nums[dq.peekFirst()];
            }
        }
        return result;
    }
}