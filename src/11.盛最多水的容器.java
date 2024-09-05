/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        // greedy algorithm
        // rigorously proved
        int maxVolume = 0;
        int i = 0, j = height.length - 1;
        while(i != j){
            int volume = (j - i) * Math.min(height[i], height[j]);
            maxVolume = Math.max(maxVolume, volume);
            if(height[i] > height[j]){
                j--;
            }else{
                i++;
            }
        }
        return maxVolume;
    }
}
// @lc code=end

