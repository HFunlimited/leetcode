/*
 * @lc app=leetcode.cn id=199 lang=java
 *
 * [199] 二叉树的右视图
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

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
    // public List<Integer> rightSideView(TreeNode root) {
    //     ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
    //     ArrayList<Integer> result = new ArrayList<>();
    //     dfs(arrayList, 0, root);
    //     while(arrayList.size() != 0){
    //         for(int i = 0; i < arrayList.size(); i++){
    //             if(arrayList.get(i).size() > 0){
    //                 result.add(arrayList.get(i).get(arrayList.get(i).size() - 1));
    //             } else {
    //                 arrayList.remove(i);
    //                 i--;
    //             }
    //         }
    //     }
    //     return result;
    // }

    // public void dfs(ArrayList<ArrayList<Integer>> arrayList, int depth, TreeNode root){
    //     if(root == null){
    //         return;
    //     }
    //     if(arrayList.size() <= depth){
    //         ArrayList<Integer> arraylist1 = new ArrayList<>();
    //         arrayList.add(arraylist1);
    //     }

    //         arrayList.get(depth).add(root.val);
    //         dfs(arrayList, depth + 1, root.left);
    //         dfs(arrayList, depth + 1, root.right);

    // } 
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        dfs(result, root, 0);
        return result;
    }

    public void dfs(List<Integer> result, TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        // 只添加每一层的最后一个元素
        if (depth == result.size()) {
            result.add(root.val);
        }
        dfs(result, root.right, depth + 1); // 先右后左，保证右子树的节点先被访问
        dfs(result, root.left, depth + 1);
    } 
}
// @lc code=end

