/*
 * @lc app=leetcode id=61 lang=java
 *
 * [61] Rotate List
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
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null)
            return head;
        k %= getLength(head);
        while (k > 0) {
            ListNode last = head;
            while (last.next != null)
                last = last.next;
            last.next = removedLastNode(head);
            head = last;
            k--;
        }
        return head;
    }

    private int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            head = head.next;
            length++;
        }
        return length;
    }

    private ListNode removedLastNode(ListNode head) {
        if (head.next.next == null) {
            head.next = null;
            return head;
        }
        removedLastNode(head.next);
        return head;
    }
}
// @lc code=end
