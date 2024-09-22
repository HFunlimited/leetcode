/*
 * @lc app=leetcode.cn id=1047 lang=java
 *
 * [1047] 删除字符串中的所有相邻重复项
 */

// @lc code=start
class Solution {
    // Time Limit Exceed
    // public static String removeDuplicates(String s) {

    //     if(s.length() <= 1){
    //         return s;
    //     }

    //     boolean isDuplicated = false;

    //     ArrayList<Character> arr = new ArrayList<>();
    //     char[] s_arr = s.toCharArray();

    //     for(int i = 0; i < s.length(); i++){
    //         if(i == s.length() - 1){
    //             arr.add(s_arr[i]);
    //         } else if(s_arr[i] != s_arr[i + 1]){
    //             arr.add(s_arr[i]);
    //         } else {
    //             i++;
    //             isDuplicated = true;
    //         }
    //     }

    //     StringBuilder stringBuilder = new StringBuilder();
    //     for (Character character : arr) {
    //         stringBuilder.append(character);
    //     }
    //     String result = stringBuilder.toString();

    //     if(isDuplicated){
    //         return removeDuplicates(result);
    //     } else {
    //         return result;
    //     }
    // }


    // use stack to achieve time complexity o(n)
    public static String removeDuplicates(String s) {

        LinkedList<Character> list = new LinkedList<>();
        for(int i = 0; i < s.length(); i++){
            if(list.size() == 0 || s.charAt(i) != list.getLast()){
                list.addLast(s.charAt(i));
            } else {
                list.removeLast();
            }
        }
        
        StringBuilder stringBuilder = new StringBuilder();
        for (Character character : list) {
            stringBuilder.append(character);
        }
        String result = stringBuilder.toString();
        
        return result;
    }
}
// @lc code=end

