package codeTest.Boke1102;

public class Problem5 {
    public int maxProfit (int[] prices) {
        int n = prices.length;
        int[] dp = new int[n];
        int minNum = Integer.MAX_VALUE;
        dp[0] = 0;
        for (int i=1;i<n;++i){
            if (prices[i]<=prices[i-1]) {
                minNum = Math.min(minNum,prices[i]);
                dp[i] = dp[i - 1];
            }
            else{
                minNum = Math.min(minNum,prices[i]);
                dp[i] = Math.max(dp[i-1],prices[i]-minNum);
            }
        }
        return dp[n-1];
    }
}
