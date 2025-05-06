/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

// @lc code=start

import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // test sync
        int sum = 0;
        int carry = 0;
        ListNode result = new ListNode(0);
        ListNode current = result;

        while(l1 != null || l2 != null) {
            if (l1 == null) {
                sum = l2.val + carry;
                l2 = l2.next;
            } else if (l2 == null) {
                sum = l1.val + carry;
                l1 = l1.next;
            } else {
                sum = l1.val + l2.val + carry;
                l1 = l1.next;
                l2 = l2.next;
            }
            
            if (sum >= 10) {
                sum = sum - 10;
                carry = 1;
            } else {
                carry = 0;
            }

            current.next = new ListNode(sum);
            current = current.next;
        }
        if(carry == 1) {
            current.next = new ListNode(1);
        }

        return result.next;
    }
}
// @lc code=end