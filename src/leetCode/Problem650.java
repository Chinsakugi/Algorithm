package leetCode;

public class Problem650 {
    public int minSteps(int n) {
        if (n==1)
            return 0;
        int[] dp = new int[n+1];
        dp[1] = 0;
        dp[2] = 2;
        for (int i= 3;i<=n;++i){
            int min = 100000000;
            for (int j = 2;j<=i/2;++j){
                if (i%j==0)
                    min = Math.min(min,dp[j] + dp[i/j]);
            }
            if (100000000==min)
                dp[i] = i;
            else
                dp[i] = min;
        }
        return dp[n];
    }

    /*u
    分解质因数
    class Solution {
    public int minSteps(int n) {
        int ans = 0;
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                ans += i;
                n /= i;
            }
        }
        if (n != 1) ans += n;
        return ans;
    }
}
     */

    public static void main(String[] args) {
        Problem650 solution = new Problem650();
        System.out.println(solution.minSteps(18));
    }

}
