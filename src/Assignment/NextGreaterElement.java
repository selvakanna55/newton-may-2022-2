package Assignment;

import java.util.*;


public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < nums2.length; i++) {
            while (!st.isEmpty() && st.peek() < nums2[i]) {
                hm.put(st.pop(), nums2[i]);
            }
            st.push(nums2[i]);
        }
        while (!st.isEmpty()) {
            hm.put(st.pop(), -1);
        }

        int n2 = nums1.length;
        int ans[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            ans[i] = hm.get(nums1[i]);
        }
        return ans;


    }
}
