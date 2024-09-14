/*
 * @lc app=leetcode.cn id=24 lang=java
 *
 * [24] 两两交换链表中的节点
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        // ListNode p = head;
        // if(p == null){
        //     return p;
        // }
        // ListNode q = head.next;
        // if(q == null){
        //     return head;
        // }

        // ListNode empty = new ListNode(0, head);
        // ListNode r = empty;
        // while(p != null && q != null){
        //     p.next = q.next;
        //     q.next = p;
        //     r.next = q;
        //     r = p;
        //     if(p.next == null){
        //         break;
        //     }
        //     p = p.next;
        //     q = p.next;
        // }
        // return empty.next;

        // recursion
        if(head == null || head.next == null){
            return head;
        }
        ListNode node = head.next;
        head.next = swapPairs(node.next);
        node.next = head;

        return node;
    }
}
// @lc code=end

