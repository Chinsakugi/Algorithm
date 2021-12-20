package leetCode;

import java.util.Arrays;

public class offer_05 {
    public String replaceSpace(String s) {
        int len = s.length();
        if(len==0)
            return s;
        int blankNum = 0;
        for (int i = 0;i<len;++i){
            if (s.charAt(i)==' ')
                ++blankNum;
        }
        char[] res = new char[blankNum*2+len];
        int index = len-1;
        for (int i=blankNum*2+len-1;i>=0;--i){
            if (s.charAt(index)!=' ')
                res[i] = s.charAt(index--);
            else{
                res[i--] = '0';
                res[i--] = '2';
                res[i] = '%';
                --index;
            }
        }
        return new String(res);
    }
}
