/*
 * @lc app=leetcode.cn id=150 lang=java
 *
 * [150] 逆波兰表达式求值
 */

// @lc code=start
class Solution {
    public int evalRPN(String[] tokens) {
        ArrayList<Integer> stack = new ArrayList<Integer>();
        int result;
        for(String s: tokens){
            if(s.equals("+")){
                result = stack.get(stack.size() - 2) + stack.get(stack.size() - 1);
                stack.remove(stack.size() - 1);
                stack.remove(stack.size() - 1);
                stack.add(result);
            } else if (s.equals("-")){
                result = stack.get(stack.size() - 2) - stack.get(stack.size() - 1);
                stack.remove(stack.size() - 1);
                stack.remove(stack.size() - 1);
                stack.add(result);
            } else if(s.equals("*")){
                result = stack.get(stack.size() - 2) * stack.get(stack.size() - 1);
                stack.remove(stack.size() - 1);
                stack.remove(stack.size() - 1);
                stack.add(result);
            } else if(s.equals("/")){
                result = stack.get(stack.size() - 2) / stack.get(stack.size() - 1);
                stack.remove(stack.size() - 1);
                stack.remove(stack.size() - 1);
                stack.add(result);
            } else {
                result = Integer.parseInt(s);
                stack.add(result);
            }
        }
        return stack.get(0);
    }
}
// @lc code=end

