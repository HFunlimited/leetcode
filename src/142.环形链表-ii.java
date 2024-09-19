/*
 * @lc app=leetcode.cn id=142 lang=java
 *
 * [142] 环形链表 II
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
    public ListNode detectCycle(ListNode head) {
        // more like a algebraic problem
        // use HashSet to solve it quickly but memory-consuming

        ListNode fast = head;
        ListNode slow = head;
        ListNode ptr = head;

        while(true){
            if(fast == null || fast.next == null){
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                break;
            }
        }
        while(ptr != slow){
            ptr = ptr.next;
            slow = slow.next;
        }
        return ptr;
    }
}
// @lc code=end

