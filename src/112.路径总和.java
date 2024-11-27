/*
 * @lc app=leetcode.cn id=112 lang=java
 *
 * [112] 路径总和
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        return dfs(root, root.val, targetSum);
    }

    public boolean dfs(TreeNode root, int curSum, int targetSum){
        if(root.left == null && root.right == null && curSum == targetSum){
            return true;
        }
        if(root.left == null && root.right == null && curSum != targetSum){
            return false;
        }

        if(root.left == null){
            return dfs(root.right, curSum + root.right.val, targetSum);
        } else if(root.right == null){
            return dfs(root.left, curSum + root.left.val, targetSum);
        } else {
            return dfs(root.left, curSum + root.left.val, targetSum) || dfs(root.right, curSum + root.right.val, targetSum);
        }
        
    }
}
// @lc code=end

