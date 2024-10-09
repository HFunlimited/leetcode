/*
 * @lc app=leetcode.cn id=454 lang=java
 *
 * [454] 四数相加 II
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        // not that easy

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int res = 0;

        for(int i: nums1){
            for (int j : nums2) {
                int sum = i + j;
                if(hashMap.containsKey(sum)){
                    hashMap.put(sum, hashMap.get(sum) + 1);
                } else {
                    hashMap.put(sum, 1);
                }
            }
        }

        for(int i: nums3){
            for(int j: nums4){
                int sum = - i - j;
                if(hashMap.containsKey(sum)){
                    res = res + hashMap.get(sum);
                }
            }
        }

        return res;
    }
}
// @lc code=end

