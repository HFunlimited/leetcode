/*
 * @lc app=leetcode.cn id=541 lang=java
 *
 * [541] 反转字符串 II
 */

// @lc code=start
class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        int iteration = s.length() / (2 * k);

        for(int i = 0; i < iteration; i++){
            for(int j = i * 2 * k + k - 1; j >= i * 2 * k; j--){
                stringBuilder.append(s.charAt(j));
            }
            for(int j = i * 2 * k + k; j < i * 2 * k + 2 * k; j++){
                stringBuilder.append(s.charAt(j));
            }
        }

        if(s.length() - iteration * 2 * k <= k){
            for(int j = s.length() - 1; j >= iteration * 2 * k; j--){
                stringBuilder.append(s.charAt(j));
            }
        } else {
            for(int j = iteration * 2 * k + k - 1; j >= iteration * 2 * k; j--){
                stringBuilder.append(s.charAt(j));
            }
            for(int j = iteration * 2 * k + k; j < s.length(); j++){
                stringBuilder.append(s.charAt(j));
            }
        }

        return stringBuilder.toString();
    }
}
// @lc code=end

