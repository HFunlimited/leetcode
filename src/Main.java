import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxSlidingWindow(nums, 3)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {        
        LinkedList<Integer> linkedList = new LinkedList<>();
        int[] result = new int[nums.length - k + 1];
        for(int i = 0; i < nums.length; i++){
            if(linkedList.size() == 0 || nums[i] > nums[linkedList.getLast()]){
                linkedList.addLast(i);
            }

            if(i - linkedList.getFirst() >= k - 1){
                result[i - k + 1] = nums[linkedList.getLast()]; 
            }
        }

        return result;
    }
}


