/*
 * @lc app=leetcode.cn id=383 lang=java
 *
 * [383] 赎金信
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(char c: magazine.toCharArray()){
            if(hashMap.containsKey(c)){
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }
        
        for(char c: ransomNote.toCharArray()){
            if(!hashMap.containsKey(c)){
                return false;
            } else {
                if(hashMap.get(c) < 1){
                    return false;
                } else {
                    hashMap.put(c, hashMap.get(c) - 1);
                }
            }
        }

        return true;
    }
}
// @lc code=end

