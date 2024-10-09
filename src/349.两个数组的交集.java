/*
 * @lc app=leetcode.cn id=349 lang=java
 *
 * [349] 两个数组的交集
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();

        for(int i: nums1){
            hashSet1.add(i);
        }
        for(int i: nums2){
            if(hashSet1.contains(i)){
                hashSet2.add(i);
            }
        }
        
        int[] res = new int[hashSet2.size()]; 
        int index = 0;
        for(Integer i: hashSet2){
            res[index++] = i;
        }
        
        return res;
    }
}
// @lc code=end

