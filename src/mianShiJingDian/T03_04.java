package mianShiJingDian;

import java.util.Stack;

public class T03_04 {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    /** Initialize your data structure here. */
    public T03_04() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (stack2.empty()){
            while (!stack1.empty()){
                stack2.push(stack1.peek());
                stack1.pop();
            }
        }
        return stack2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (stack2.empty()){
            while (!stack1.empty()){
                stack2.push(stack1.peek());
                stack1.pop();
            }
        }
        return stack2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.empty() && stack2.empty();
    }
}
