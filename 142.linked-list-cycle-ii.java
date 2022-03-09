/*
 * @lc app=leetcode id=142 lang=java
 *
 * [142] Linked List Cycle II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
import java.util.*;

class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null)
            return null;
        HashSet<ListNode> set = new HashSet<>();
        ListNode pos = head;
        while (pos.next != null) {
            if (!set.add(pos))
                return pos;
            pos = pos.next;
        }
        return null;
    }
}
// @lc code=end
