/*
 * @lc app=leetcode id=129 lang=java
 *
 * [129] Sum Root to Leaf Numbers
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

    private int sum;

    public int sumNumbers(TreeNode root) {
        if (root.left == null && root.right == null)
            return root.val;
        helper(root, 0);
        return sum;
    }

    private void helper(TreeNode root, int num) {
        if (root == null)
            return;
        num = num * 10 + root.val;
        if (root.left == null && root.right == null) {
            sum += num;
            return;
        }
        helper(root.left, num);
        helper(root.right, num);
    }
}
// @lc code=end
