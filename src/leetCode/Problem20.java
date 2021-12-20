package leetCode;

import java.util.Stack;

public class Problem20 {
    static boolean isValid(String s) {
        Stack<Character> chars = new Stack<>();
        for (char c : s.toCharArray()){
            if (c=='('||c=='{'||c=='[')
                chars.push(c);
            if (c==')'||c=='}'||c==']'){
                if (chars.isEmpty())
                    return false;
                char x = chars.pop();
                if (c==')'&&x!='('||c=='}'&&x!='{'||c==']'&&x!='[')
                    return false;
            }
        }
        return chars.isEmpty();
    }
}
