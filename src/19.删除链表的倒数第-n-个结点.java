/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第 N 个结点
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head;
        int cnt = 1;
        while(p.next != null){
            p = p.next;
            cnt++;
        }

        int i = 0;
        p = head;
        if(cnt == n){
            return p.next;
        }
        while(i != cnt - n - 1){
            p = p.next;
            i++;
        }
        p.next = p.next.next;
        return head;
    }
}
// @lc code=end

