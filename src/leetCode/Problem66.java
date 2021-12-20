package leetCode;

import java.util.LinkedList;

public class Problem66 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 0;
        LinkedList<Integer> res = new LinkedList<>();
        digits[n-1]+=1;
        for (int i=n-1;i>=0;--i){
            res.addFirst((digits[i]+carry)%10);
            carry = (digits[i]+carry) / 10;
        }
        if (carry!=0)
            res.addFirst(1);
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
