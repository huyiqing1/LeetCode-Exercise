/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */

// @lc code=start
import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double mid = 0;
        List<Integer> list = new ArrayList<>();
        for (int num : nums1)
            list.add(num);
        for (int num : nums2)
            list.add(num);
        Collections.sort(list);
        if (list.size() % 2 != 0) {
            mid = list.get(list.size() / 2);
        } else {
            mid = (double) (list.get(list.size() / 2) + list.get(list.size() / 2 - 1)) / 2;
        }
        return mid;
    }
}
// @lc code=end
