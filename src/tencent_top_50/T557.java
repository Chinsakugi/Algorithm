package tencent_top_50;

import java.util.Arrays;
import java.util.Collections;

public class T557 {
    public String reverseWords(String s) {
        if (s==null||s.length()<=1)
            return s;
        int len = s.length();
        int left = 0, right = 0;
        char[] arr = s.toCharArray();
        while (left<len){
            if (right<len && arr[right]!=' '){
                right++;
            }else {
                int r = right < len ? right -1 :len - 1;
                int l = left > 0 ? left+1 : 0;
                while (l<r) {
                    char temp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = temp;
                    l++;
                    r--;
                }
                left = right;
                right++;
            }
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        T557 solution = new T557();
        System.out.println(solution.reverseWords("afd agddsf af,af 123"));
    }
}
