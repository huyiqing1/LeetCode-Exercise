import java.util.*;

/*
 * @lc app=leetcode id=105 lang=java
 *
 * [105] Construct Binary Tree from Preorder and Inorder Traversal
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

    private int index = 0;
    private HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return helper(preorder, inorder, 0, map.size() - 1);
    }

    private TreeNode helper(int[] preorder, int[] inorder, int start, int end) {
        if (start > end)
            return null;
        TreeNode root = new TreeNode(preorder[index++]);
        int mid = map.get(root.val);
        root.left = helper(preorder, inorder, start, mid - 1);
        root.right = helper(preorder, inorder, mid + 1, end);
        return root;
    }
}
// @lc code=end
