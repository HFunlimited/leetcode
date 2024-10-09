/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */

// @lc code=start

import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hashSet = new HashSet<>();
        while(n != 1){
            hashSet.add(n);
            int m = n;
            n = 0;
            while(m != 0){
                n = n + (m % 10) * (m % 10);
                m = m / 10;
            }
            if(hashSet.contains(n)){
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

