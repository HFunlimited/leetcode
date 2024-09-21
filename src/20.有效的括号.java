/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> stack = new ArrayList<Character>();
        for(char c: s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stack.add(c);
            } else {
                if(stack.size() == 0){
                    return false;
                }
                if(c == ')'){
                    if(stack.get(stack.size() - 1) != '('){
                        return false;
                    } else {
                        stack.remove(stack.size() - 1);
                    }
                }
                if(c == ']'){
                    if(stack.get(stack.size() - 1) != '['){
                        return false;
                    } else {
                        stack.remove(stack.size() - 1);
                    }
                }
                if(c == '}'){
                    if(stack.get(stack.size() - 1) != '{'){
                        return false;
                    } else {
                        stack.remove(stack.size() - 1);
                    }
                }
            }
        }
        if(stack.size() != 0){
            return false;
        } 
        return true;
    }
}
// @lc code=end

