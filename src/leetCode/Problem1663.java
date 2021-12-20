package leetCode;

import java.util.Arrays;

public class Problem1663 {
    public String getSmallestString(int n, int k) {
        char[] s = new char[n];
        Arrays.fill(s,'a');
        int num = (k-n)/25;
        int i=0;
        while(i<num){
            s[n-i-1]='z';
            ++i;
            k-=26;
        }
        if (i<n)
            s[n-i-1] = (char)( k-(n-num-1) + 'a'-1);
        return String.valueOf(s);
    }

    public static void main(String[] args) {
        System.out.println((int)('a'+'p'));
        System.out.println((int)('w'+'z'));

    }
}
