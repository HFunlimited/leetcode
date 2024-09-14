/*
 * @lc app=leetcode.cn id=977 lang=java
 *
 * [977] 有序数组的平方
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int l = 0, r = nums.length - 1, i = nums.length - 1;
        while(l <= r){
            int left = nums[l] * nums[l];
            int right = nums[r] * nums[r];
            if(left > right){
                arr[i--] = left;
                l++;
            } else {
                arr[i--] = right;
                r--;
            }
        }
        return arr;
    }
}
// @lc code=end

