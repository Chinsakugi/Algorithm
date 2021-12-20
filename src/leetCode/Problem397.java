package leetCode;

public class Problem397 {
    public int integerReplacement(int n) {
        long x = n;
        int ans = 0;
        while (x!=1){
            if (x%2==0)
                x>>=1;
            else {
                if (x!=3&&((x>>1)&1)==1)
                    x++;
                else
                    x--;
            }
            ans++;
        }
        return ans;
    }
}
