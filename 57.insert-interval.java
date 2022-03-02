import java.util.*;
/*
 * @lc app=leetcode id=57 lang=java
 *
 * [57] Insert Interval
 */

// @lc code=start
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        LinkedList<int[]> list = new LinkedList<>();
        int[][] merge = new int[intervals.length + 1][];
        merge[0] = newInterval;
        for (int i = 0; i < intervals.length; i++) {
            merge[i + 1] = intervals[i];
        }
        Arrays.sort(merge, (a, b) -> Integer.compare(a[0], b[0]));
        for (int[] interval : merge) {
            if (list.isEmpty() || list.getLast()[1] < interval[0])
                list.add(interval);
            else
                list.getLast()[1] = Math.max(list.getLast()[1], interval[1]);
        }
        return list.toArray(new int[list.size()][]);
    }
}
// @lc code=end
