import java.util.*;
/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0)
            return true;
        Queue<Character> q = new LinkedList<>();
        for (char c : s.toCharArray())
            q.add(c);
        for (char c : t.toCharArray()) {
            if (!q.isEmpty() && c == q.peek())
                q.poll();
        }
        return q.isEmpty();
    }
}
// @lc code=end
