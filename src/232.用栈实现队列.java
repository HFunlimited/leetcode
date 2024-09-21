/*
 * @lc app=leetcode.cn id=232 lang=java
 *
 * [232] 用栈实现队列
 */

// @lc code=start
class MyQueue {
    MyStack myStack1;
    MyStack myStack2;

    public MyQueue() {
        myStack1 = new MyStack();
        myStack2 = new MyStack();
    }

    public void push(int x) {
        myStack1.pushToTop(x);
    }

    public int pop() {
        while(myStack1.size() > 1){
            int x = myStack1.popFromTop();
            myStack2.pushToTop(x);
        }
        int result = myStack1.popFromTop();
        while(myStack2.size() > 0){
            int x = myStack2.popFromTop();
            myStack1.pushToTop(x);
        }
        return result;
    }

    public int peek() {
        while(myStack1.size() > 1){
            int x = myStack1.popFromTop();
            myStack2.pushToTop(x);
        }
        int result = myStack1.popFromTop();
        myStack2.pushToTop(result);
        while(myStack2.size() > 0){
            int x = myStack2.popFromTop();
            myStack1.pushToTop(x);
        }
        return result;
    }

    public boolean empty() {
        return myStack1.isEmpty();
    }
}

class MyStack{
    List<Integer> stack = new LinkedList<>();

    public void pushToTop(int x){
        stack.add(x);
    }

    public int popFromTop(){
        int x = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return x;
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }
}
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

