package mianShiJingDian;

import java.util.Stack;

public class T03_02 {

    Stack<Integer> stack1;
    Stack<Integer> stack2;
    /** initialize your data structure here. */
    public T03_02() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
        if (stack2.empty())
            stack2.push(x);
        else {
            if (x<=stack2.peek())
                stack2.push(x);
        }
    }

    public void pop() {
        int x = stack1.peek();
        stack1.pop();
        if (stack2.peek()==x)
            stack2.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int getMin() {
        if (stack2.empty())
            return -1;
        else
            return stack2.peek();
    }
}
