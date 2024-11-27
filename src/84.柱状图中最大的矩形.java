/*
 * @lc app=leetcode.cn id=84 lang=java
 *
 * [84] 柱状图中最大的矩形
 */

// @lc code=start

import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights.length == 0){
            return 0;
        }
        if(heights.length == 1){
            return heights[0];
        }

        int[] newHeights = new int[heights.length + 2];
        newHeights[0] = 0;
        System.arraycopy(heights, 0, newHeights, 1, heights.length);
        newHeights[heights.length + 1] = 0;
        heights = newHeights;

        int res = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for(int i = 1; i < heights.length; i++){
            while(heights[i] < heights[stack.peek()]){
                int height = heights[stack.pop()];
                int width = i - stack.peek() - 1;
                res = Math.max(res, height * width);          
            }
            stack.push(i);
        }

        return res;
    }
}
// @lc code=end

