/*
 * @lc app=leetcode id=86 lang=java
 *
 * [86] Partition List
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
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null)
            return head;

        ListNode slow = new ListNode(0);
        ListNode fast = new ListNode(0);

        ListNode slowPos = slow;
        ListNode fastPos = fast;

        while (head != null) {
            if (head.val < x) {
                slowPos.next = new ListNode(head.val);
                slowPos = slowPos.next;
            } else {
                fastPos.next = new ListNode(head.val);
                fastPos = fastPos.next;
            }
            head = head.next;
        }
        slowPos.next = fast.next;
        return slow.next;
    }
}
// @lc code=end
