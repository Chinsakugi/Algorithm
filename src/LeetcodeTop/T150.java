package LeetcodeTop;

import java.util.Stack;

public class T150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for (String str : tokens){
            if (str.equals("+")){
                int x = stack.pop();
                int y = stack.pop();
                stack.push(x+y);
            }
            else if (str.equals("-")){
                int x = stack.pop();
                int y = stack.pop();
                stack.push(y-x);
            }
            else if (str.equals("*")){
                int x = stack.pop();
                int y = stack.pop();
                stack.push(x*y);
            }
            else if (str.equals("/")){
                int x = stack.pop();
                int y = stack.pop();
                stack.push(y/x);
            }else
                stack.push(Integer.valueOf(str));
        }
        return stack.pop();
    }
}
