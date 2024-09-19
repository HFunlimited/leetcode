/*
 * @lc app=leetcode.cn id=25 lang=java
 *
 * [25] K 个一组翻转链表
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
    public ListNode reverseKGroup(ListNode head, int k) {
        // recursion method

        ListNode curNode = head;
        int cnt = 0;
        while(curNode != null && cnt < k){
            cnt ++;
            curNode = curNode.next;
        }
        if(cnt < k){
            return head;
        }

        ListNode preNode = head;
        ListNode nextNode;
        curNode = head.next;
        cnt = 1;
        while(cnt < k){
            nextNode = curNode.next;
            curNode.next = preNode;
            preNode = curNode;
            curNode = nextNode;
            cnt++;
        }
        head.next = reverseKGroup(curNode, k);
        head = preNode;

        return head;
    }
}
// @lc code=end

