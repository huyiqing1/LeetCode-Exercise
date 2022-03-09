/*
 * @lc app=leetcode id=138 lang=java
 *
 * [138] Copy List with Random Pointer
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null)
            return null;
        Node curr = head;
        while (curr != null) {
            Node newNode = new Node(curr.val);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }
        curr = head;
        while (curr != null) {
            curr.next.random = curr.random != null ? curr.random.next : null;
            curr = curr.next.next;
        }

        Node currSlow = head;
        Node currFast = head.next;
        Node headFast = currFast;
        while (currSlow != null) {
            currSlow.next = currSlow.next.next;
            currFast.next = currFast.next == null ? null : currFast.next.next;
            currSlow = currSlow.next;
            currFast = currFast.next;
        }
        return headFast;
    }
}
// @lc code=end
