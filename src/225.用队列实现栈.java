/*
 * @lc app=leetcode.cn id=225 lang=java
 *
 * [225] 用队列实现栈
 */

// @lc code=start
class MyStack {
    MyQueue queue1 = new MyQueue();
    MyQueue queue2 = new MyQueue();

    public MyStack() {
        // queue1 = new MyQueue();
        // queue2 = new MyQueue();
    }
    
    public void push(int x) {
        queue1.pushToBack(x);
    }
    
    public int pop() {
        int result;
        while(queue1.size() > 1){
            int x = queue1.popFromFront();
            queue2.pushToBack(x);
        }
        result = queue1.popFromFront();
        while(!queue2.isEmpty()){
            int x = queue2.popFromFront();
            queue1.pushToBack(x);
        }
        return result;
    }
    
    public int top() {
        int result;
        while(queue1.size() > 1){
            int x = queue1.popFromFront();
            queue2.pushToBack(x);
        }
        result = queue1.popFromFront();
        queue2.pushToBack(result);
        while(!queue2.isEmpty()){
            int x = queue2.popFromFront();
            queue1.pushToBack(x);
        }
        return result;
    }
    
    public boolean empty() {
        return queue1.isEmpty();
    }
}

class MyQueue{
    ArrayList<Integer> queue = new ArrayList<Integer>();

    public void pushToBack(int x){
        queue.add(x);
    }

    public int popFromFront(){
        int x = queue.get(0);
        queue.remove(0);
        return x;
    }

    public int size(){
        return queue.size();
    }

    public boolean isEmpty(){
        if(queue.size() == 0){
            return true;
        } else {
            return false;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

