/*
 * @lc app=leetcode.cn id=239 lang=java
 *
 * [239] 滑动窗口最大值
 */

// @lc code=start
class Solution {
    // Time Limit Exceed

    // public int[] maxSlidingWindow(int[] nums, int k) {        
    //     int[] result = new int[nums.length - k + 1];
    //     int max = max(nums, k, 0);
    //     result[0] = max;
    //     int flag = 0;
    //     for(int i = k; i < nums.length;){
    //         if(max == nums[i - k] && flag == 0){
    //             max = max(nums, k - 1, i - k + 1);
    //             flag = 1;
    //         } else {
    //             max = max > nums[i] ? max : nums[i];
    //             result[i - k + 1] = max;
    //             i++;
    //             flag = 0;
    //         }
    //     }
    //     return result;
    // }

    // public int max(int[] nums, int k, int index){
    //     int max = nums[index];
    //     for(int i = index; i < index + k; i++){
    //         if(nums[i] > max){
    //             max = nums[i];
    //         }
    //     }
    //     return max;
    // }

    public int[] maxSlidingWindow(int[] nums, int k) {        
        LinkedList<Integer> linkedList = new LinkedList<>();
        int[] result = new int[nums.length - k + 1];
        for(int i = 0; i < nums.length; i++){
            while(linkedList.size() != 0 && nums[i] >= nums[linkedList.getLast()]){
                linkedList.removeLast();
            }

            linkedList.addLast(i);

            if(linkedList.getFirst() <= i - k){
                linkedList.removeFirst();
            }

            if(i >= k - 1){
                result[i - k + 1] = nums[linkedList.getFirst()];
            }
        }
        return result;
    }
}
// @lc code=end

