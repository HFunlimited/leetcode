/*
 * @lc app=leetcode.cn id=141 lang=java
 *
 * [141] 环形链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // not a special solution
        // HashSet<ListNode> set = new HashSet<ListNode>();
        // while(head != null){
        //     if(set.contains(head)){
        //         return true;
        //     }
        //     set.add(head);
        //     head = head.next;
        // }
        // return false;

        // a special solution
        // fast and slow pointer
        // pay attention to the conditions in case of NullPointerException
        ListNode slow = head;
        if(slow == null) return false;
        ListNode fast = head.next;
        while(slow != null && fast != null && fast.next != null){
            if(slow == fast){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
// @lc code=end

