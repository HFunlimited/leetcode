import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(7);
        myLinkedList.addAtHead(2);
        myLinkedList.addAtHead(1);
        myLinkedList.addAtIndex(3, 0);
        myLinkedList.deleteAtIndex(0);
    }
}

class MyLinkedList {
    
    int num;
    ListNode head;

    public MyLinkedList() {
        this.num = 0;
        this.head = new ListNode(0);
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
    }
}

class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val;
    }
}