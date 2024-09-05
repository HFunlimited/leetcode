/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start

import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] array = s.toCharArray();
        HashSet<Character> set =  new HashSet<>();
        int maxLength = 0;
        int i, j;
        for(i = 0, j = 0; i < array.length; i++){
            if(set.contains(array[i])){
                maxLength = Math.max(maxLength, set.size());
                for(; array[j] != array[i]; j++){
                    set.remove(array[j]);
                }
                j++;
            } else{
                set.add(array[i]);
            }
        }
        maxLength = Math.max(maxLength, set.size());
        return maxLength;
    }
}
// @lc code=end

