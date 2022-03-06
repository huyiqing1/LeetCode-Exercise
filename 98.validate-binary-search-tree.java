/*
 * @lc app=leetcode id=98 lang=java
 *
 * [98] Validate Binary Search Tree
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

    private Integer prev = null;
    boolean valid = true;

    public boolean isValidBST(TreeNode root) {
        helper(root);
        return valid;
    }

    private void helper(TreeNode root) {
        if (root == null || valid == false)
            return;
        helper(root.left);
        if (prev == null)
            prev = root.val;
        else {
            if (prev < root.val)
                prev = root.val;
            else
                valid = false;
        }
        helper(root.right);
    }
}
// @lc code=end
