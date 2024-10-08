/*
 * @lc app=leetcode.cn id=151 lang=java
 *
 * [151] 反转字符串中的单词
 */

// @lc code=start

import java.util.ArrayList;

class Solution {
    public String reverseWords(String s) {
        ArrayList<String> arr = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        for(char c: s.toCharArray()){
            if(c != ' '){
                stringBuilder.append(c);
            } else if(!stringBuilder.isEmpty()){
                    arr.add(stringBuilder.toString());
                    stringBuilder.setLength(0);
            }
        }
        if(!stringBuilder.isEmpty()){
            arr.add(stringBuilder.toString());
            stringBuilder.setLength(0);
        }

        for(int i = arr.size() - 1; i >= 0; i--){
            stringBuilder.append(arr.get(i));
            stringBuilder.append(' ');
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        return stringBuilder.toString();
        
    }
        // use repo-function
        // class Solution {
        //     public String reverseWords(String s) {
        //         // 除去开头和末尾的空白字符
        //         s = s.trim();
        //         // 正则匹配连续的空白字符作为分隔符分割
        //         List<String> wordList = Arrays.asList(s.split("\\s+"));
        //         Collections.reverse(wordList);
        //         return String.join(" ", wordList);
        //     }
        // }
}
// @lc code=end

