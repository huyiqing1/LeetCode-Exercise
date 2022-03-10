/*
 * @lc app=leetcode id=143 lang=java
 *
 * [143] Reorder List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode curr = slow;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode reverse = prev;
        boolean isEven = true;
        ListNode result = new ListNode(0);
        ListNode ptr = head;
        while (ptr != slow || reverse != null) {
            result.next = isEven ? ptr : reverse;
            ptr = isEven && ptr.next != null ? ptr.next : ptr;
            reverse = isEven && reverse.next != null ? reverse : reverse.next;
            isEven = !isEven;
            result = result.next;
        }
    }
}
// @lc code=end
