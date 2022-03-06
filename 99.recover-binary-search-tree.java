/*
 * @lc app=leetcode id=99 lang=java
 *
 * [99] Recover Binary Search Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {

    private TreeNode t1;
    private TreeNode t2;
    private TreeNode prev;

    public void recoverTree(TreeNode root) {
        findWrongNodes(root);
        int temp = t1.val;
        t1.val = t2.val;
        t2.val = temp;
    }

    private boolean findWrongNodes(TreeNode root) {
        if (root == null)
            return true;
        if (!findWrongNodes(root.left))
            return false;
        if (prev != null && prev.val > root.val) {
            t2 = root;
            if (t1 == null)
                t1 = prev;
            else
                return false;
        }
        prev = root;
        if (!findWrongNodes(root.right))
            return false;
        return true;
    }

}
// @lc code=end
