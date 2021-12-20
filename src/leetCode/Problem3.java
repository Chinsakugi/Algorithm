package leetCode;

import java.util.HashSet;

public class Problem3 {
    public int lengthOfLongestSubstring(String s) {
        if(s == null||s.equals(""))
            return 0;
        int n = s.length();
        int max = 1;
        int flag = -1;
        HashSet set = new HashSet();
        for (int i=0;i<n;++i){
            if(i!=0)
                set.remove(s.charAt(i-1));
            while (flag +1 <n){
                if(set.contains(s.charAt(flag+1)))
                    break;
                set.add(s.charAt(flag+1));
                ++flag;
            }
            max = Math.max(max, flag - i + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        Problem3 p = new Problem3();
        System.out.println(p.lengthOfLongestSubstring("abc"));
    }
}
