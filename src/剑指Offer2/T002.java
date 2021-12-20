package 剑指Offer2;

public class T002 {
    public String addBinary(String a, String b) {
        StringBuffer res = new StringBuffer();
        int n = a.length()-1;
        int m = b.length()-1;
        int carry = 0,sum;
        while (n>=0||m>=0){
            int x = n>=0 ? (a.charAt(n)-'0'):0;
            int y = m>=0 ? (b.charAt(m)-'0'):0;
            sum = (carry  + x + y) % 2;
            carry = ((x + y+carry) > 1) ? 1 : 0;
            res.append(sum);
            n--;
            m--;
        }
        if (carry!=0)
            res.append('1');
        return res.reverse().toString();
    }
}
