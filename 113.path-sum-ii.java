import java.util.*;
/*
 * @lc app=leetcode id=113 lang=java
 *
 * [113] Path Sum II
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

    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null)
            return res;
        helper(root, targetSum, new ArrayList<>());
        return res;
    }

    private void helper(TreeNode root, int targetSum, List<Integer> list) {
        if (root == null)
            return;
        list.add(root.val);
        if (root.left == null && root.right == null && targetSum == root.val) {
            res.add(new ArrayList<>(list));
        }
        if (root.left == null && root.right == null && targetSum != root.val) {
            list.remove(list.size() - 1);
            return;
        }
        helper(root.left, targetSum - root.val, list);
        helper(root.right, targetSum - root.val, list);
        list.remove(list.size() - 1);
    }
}
// @lc code=end
