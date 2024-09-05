/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        // int p, q;
        // int zeroCount = 0;
        // for(p = 0; p < nums.length; p++){
        //     if(nums[p] == 0) break;
        // }
        // while(p < nums.length){
        //     for(q = p + 1; q < nums.length; q++){
        //         if(nums[q] == 0) break;
        //     }
        //     zeroCount ++;
        //     for(int i = p + 1; i < q; i++){
        //         nums[i - zeroCount] = nums[i];
        //     }
        //     p = q;
        // }
        // for(int i = 1; i <= zeroCount; i++){
        //     nums[nums.length - i] = 0;
        // }

        // brilliant solution
        int i, j = 0;
        for(i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[j++] = nums[i];
            }
        }
        for(; j < nums.length; j++){
            nums[j] = 0;
        }
    }
}
// @lc code=end

