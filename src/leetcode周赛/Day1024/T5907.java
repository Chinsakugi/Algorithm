package leetcode周赛.Day1024;

public class T5907 {
    public int nextBeautifulNumber(int n) {
        if (n==0)
            return 1;
        int i = n+1;
        for (;i< Integer.MAX_VALUE;++i){
            if (isBalance(i))
                break;
        }
        return i;
    }

    boolean isBalance(int nums){
        int[] hash = new int[8];
        while (nums!=0) {
            if (nums%10 > 7 || nums%10 == 0)    return false;
            ++hash[ nums%10 ];
            nums /= 10;
        }
        for (int i = 1; i <= 7; ++i) {
            if (hash[i]!=0 && hash[i] != i)   return false;
        }
        return true;

    }
}
