/*
 * @lc app=leetcode.cn id=100 lang=java
 *
 * [100] 相同的树
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return dfs(p, q);
    }
    public boolean dfs(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        } else if(p == null && q != null || p != null && q == null){
            return false;
        } else if(p.val != q.val){
            return false;
        } else {
            return dfs(p.left, q.left) && dfs(p.right, q.right);
        }
        
    }
}
// @lc code=end

