/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        // Time Limit Exceeded
        // HashSet<List<Integer>> set = new HashSet<List<Integer>>();
        // for(int i = 0; i < nums.length - 2; i++){
        //     for(int j = i + 1; j < nums.length - 1; j++){
        //         for(int k = j + 1; k < nums.length; k++){
        //             if(nums[i] + nums[j] + nums[k] == 0){
        //                 int[] array = {nums[i], nums[j], nums[k]};
        //                 Arrays.sort(array);
        //                 ArrayList<Integer> list = new ArrayList<>();
        //                 for(int num: array){
        //                     list.add(num);
        //                 }
        //                 set.add(list);
        //             }
        //         }
        //     }
        // }
        // return new ArrayList<List<Integer>>(set);

        // with two pointers, three dim problem is reduced to two dim
        // not that easy
        int i = 0, j, k;
        ArrayList<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        while(nums[i] <= 0 && i < nums.length - 1){
            j = i + 1;
            k = nums.length - 1;
            while(j < k){
                if(nums[i] + nums[j] + nums[k] < 0){
                    while(nums[j] == nums[++j] && j < k);
                } else if(nums[i] + nums[j] + nums[k] > 0){
                    while(nums[k] == nums[--k] && j < k);
                } else{
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while(nums[j] == nums[++j] && j < k);
                    while(nums[k] == nums[--k] && j < k);
                }
            }
            while(nums[i] == nums[++i] && i < nums.length - 1);
        }
        return res;
    }
}
// @lc code=end

