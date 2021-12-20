package leetCode;

public class Problem264 {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        int p2 = 1,p3=1,p5=1;
        for(int i=2;i<=n;++i){
            int num2 = dp[p2] * 2;
            int num3 = dp[p3] * 3;
            int num5 = dp[p5] * 5;
            dp[i] = Math.min(Math.min(num2,num3),num5);
            if (dp[i]==num2){
                p2++;
            }
            else if(dp[i]==num3){
                p3++;
            }
            else {
                p5++;
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Problem264 problem = new Problem264();
        System.out.println(problem.nthUglyNumber(10));
    }
}
