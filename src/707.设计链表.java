/*
 * @lc app=leetcode.cn id=707 lang=java
 *
 * [707] 设计链表
 */

// @lc code=start
class MyLinkedList {
    
    int num;
    ListNode head;

    public MyLinkedList() {
        num = 0;
        head = new ListNode(0);
    }
    
    public int get(int index) {
        if(index >= num){
            return -1;
        }
        ListNode curNode = head;
        for(int i = 0; i <= index; i++){
            curNode = curNode.next;
        }
        return curNode.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(num, val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index > num){
            return;
        }
        ListNode curNode = head;
        for(int i = 0; i < index; i++){
            curNode = curNode.next;
        }
        ListNode nextNode = curNode.next;
        curNode.next = new ListNode(val);
        num++;
        curNode.next.next = nextNode;
    }
    
    public void deleteAtIndex(int index) {
        if(index >= num){
            return;
        }
        ListNode curNode = head;
        for(int i = 0; i < index; i++){
            curNode = curNode.next;
        }
        curNode.next = curNode.next.next;
        num--;
    }
}

class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
// @lc code=end

