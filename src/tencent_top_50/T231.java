package tencent_top_50;

public class T231 {
    public boolean isPowerOfTwo(int n) {
        if (n<=0)
            return false;
        int x = 0;
        while (n!=0){
            x += n & 1;
            n = n >> 1;
        }
        return x==1;
    }
}

/*
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n-1)) == 0;
    }
}
 */
