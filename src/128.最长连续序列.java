/*
 * @lc app=leetcode.cn id=128 lang=java
 *
 * [128] 最长连续序列
 */

// @lc code=start

import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {

        // The average complexity of constains method is O(1)
        // The complexity of the algorithm is O(n)
        
        // HashSet<Integer> set = new HashSet<>();
        // int maxLength = 0;
        // for(int num: nums){
        //     set.add(num);
        // }
        // for(int num: set){
        //     if(!set.contains(num - 1)){
        //         int currentLength = 1;
        //         while(set.contains(num + 1)){
        //             currentLength ++;
        //             num ++;
        //         }
        //         maxLength = Math.max(maxLength, currentLength);
        //     }           
        // }
        // return maxLength;

        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int maxLength = 0;
        int currentLength = 1;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] + 1 == nums[i + 1]){
                currentLength ++;
            } else if(nums[i] != nums[i + 1]){
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }
        maxLength = Math.max(maxLength, currentLength);
        return maxLength;
    }
}
// @lc code=end

