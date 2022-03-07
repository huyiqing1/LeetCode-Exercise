import java.util.*;
/*
 * @lc app=leetcode id=106 lang=java
 *
 * [106] Construct Binary Tree from Inorder and Postorder Traversal
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

    private HashMap<Integer, Integer> map = new HashMap<>();
    private int index;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        index = postorder.length - 1;
        return helper(inorder, postorder, 0, inorder.length - 1);
    }

    private TreeNode helper(int[] inorder, int[] postorder, int start, int end) {
        if (start > end)
            return null;
        TreeNode root = new TreeNode(postorder[index--]);
        int mid = map.get(root.val);
        root.right = helper(inorder, postorder, mid + 1, end);
        root.left = helper(inorder, postorder, start, mid - 1);
        return root;
    }
}
// @lc code=end
