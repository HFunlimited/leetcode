/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
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
    public ListNode reverseList(ListNode head) {
        // recursion method
        // you should think reversely, which needs to accommodate to
        if(head == null || head.next == null){
            return head;
        }

        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        // the last node is passed through all recursions
        // different from problems before where every return differs
        return node;

        // iteration method
        // if(head == null){
        //     return null;
        // }
        // ListNode preNode = head;
        // ListNode curNode = head.next;
        // ListNode nextNode;
        // while(preNode != null && curNode != null){
        //     nextNode = curNode.next;
        //     curNode.next = preNode;
        //     preNode = curNode;
        //     curNode = nextNode;
        // }
        // head.next = null;
        // return preNode;
    }
}
// @lc code=end

