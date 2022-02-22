import java.util.*;
/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        else if (x < 10)
            return true;

        char[] arr = ("" + x).toCharArray();
        Queue<Character> q = new LinkedList<>();
        for (char c : arr)
            q.add(c);
        for (int i = arr.length - 1; i >= 0; i--) {
            if (q.poll() != arr[i])
                return false;
        }
        return true;
    }
}
// @lc code=end

