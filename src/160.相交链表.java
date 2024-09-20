/*
 * @lc app=leetcode.cn id=160 lang=java
 *
 * [160] 相交链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // memory complexity o(m + n)

        // HashSet<ListNode> set = new HashSet<ListNode>();
        // while(headA != null){
        //     set.add(headA);
        //     headA = headA.next;
        // }
        // while(headB != null){
        //     if(set.contains(headB)){
        //         return headB;
        //     }
        //     headB = headB.next;
        // }
        // return null;
        
        // the simpliest method is hard to work out
        // but a secondary choice is worth learning

        ListNode ptrA = headA;
        ListNode ptrB = headB;
        int cntA = 0, cntB = 0;

        while(ptrA != null){
            cntA++;
            ptrA = ptrA.next;
        }
        while(ptrB != null){
            cntB++;
            ptrB = ptrB.next;
        }

        // tries to align the pointers
        // if there is an intersection, A and B have the same tail
        if(cntA > cntB){
            for(int i = 0; i < cntA - cntB; i++){
                headA = headA.next;
            }
        }
        if(cntA < cntB){
            for(int i = 0; i < cntB - cntA; i++){
                headB = headB.next;
            }
        }

        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }
}
// @lc code=end

