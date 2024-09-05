/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int maxNum = n * n;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int currentNum = 1;

        while(currentNum <= maxNum){
            for(int i = left; i <= right; i++){
                matrix[top][i] = currentNum;
                currentNum ++;
            }
            top = top + 1;
            for(int i = top; i <= bottom; i++){
                matrix[i][right] = currentNum;
                currentNum ++;
            }
            right = right - 1;
            for(int i = right; i >= left; i--){
                matrix[bottom][i] = currentNum;
                currentNum ++;
            }
            bottom = bottom - 1;
            for(int i = bottom; i >= top; i--){
                matrix[i][left] = currentNum;
                currentNum ++;
            }
            left = left + 1;
        }

        return matrix;
    }

}
// @lc code=end

