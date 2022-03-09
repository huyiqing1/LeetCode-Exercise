/*
 * @lc app=leetcode id=137 lang=java
 *
 * [137] Single Number II
 */

// @lc code=start
import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num))
                map.put(num, 1);
            else if (map.get(num) == 2)
                map.remove(num);
            else {
                map.put(num, map.get(num) + 1);
            }
        }
        return map.keySet().iterator().next();
    }
}
// @lc code=end
