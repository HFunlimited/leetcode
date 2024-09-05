/*
 * @lc app=leetcode.cn id=209 lang=java
 *
 * [209] 长度最小的子数组
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // nice try to use prefix, but not figure it out
        // instead of using prefix, we can handle elements in the prefix one by one
        int sum = 0;
        int minLength = nums.length + 1;

        for(int i = 0, j = 0; j < nums.length; j++){
            sum  = sum + nums[j];
            if(sum >= target){
                // the line below can be deleted, awesome!
                // minLength = Math.min(j - i + 1, minLength);

                while(sum >= target){
                    // update minlength is a must after clean the pre-elements
                    // in former version I tried to verify the sum after clean the prefix completely, which got me into trouble
                    minLength = Math.min(j - i + 1, minLength);
                    sum = sum - nums[i++];
                }
            }
        }

        return minLength == nums.length + 1 ? 0 : minLength;
    }
}
// @lc code=end

