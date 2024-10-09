/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */

// @lc code=start

import java.util.Arrays;
import java.util.HashMap;

// only the last case cannnot pass, maybe this method is too complicated

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         HashMap<Character, Integer> hashMapS = new HashMap<>();
//         HashMap<Character, Integer> hashMapT = new HashMap<>();

//         for(char c: s.toCharArray()){
//             if(hashMapS.containsKey(c)){
//                 hashMapS.put(c, hashMapS.get(c) + 1);
//             } else {
//                 hashMapS.put(c, 1);
//             }
//         }
//         for(char c: t.toCharArray()){
//             if(hashMapT.containsKey(c)){
//                 hashMapT.put(c, hashMapT.get(c) + 1);
//             } else {
//                 hashMapT.put(c, 1);
//             }
//         }

//         if(hashMapS.size() > hashMapT.size()){
//             for(char c: hashMapS.keySet()){
//                 if(hashMapT.containsKey(c)){
//                     if(hashMapS.get(c) != hashMapT.get(c)){
//                         return false;
//                     }
//                 } else {
//                     return false;
//                 }
//             }
//         } else {
//             for(char c: hashMapT.keySet()){
//                 if(hashMapS.containsKey(c)){
//                     if(hashMapT.get(c) != hashMapS.get(c)){
//                         return false;
//                     }
//                 } else {
//                     return false;
//                 }
//             }
//         }

//         return true;
//     }
// }

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }
}
// @lc code=end

