package NowCoder.Alibaba2021;

import java.util.Scanner;

public class Problem2 {
    public static long fun(int a, int b, int n){
        if (n==0)
            return 2;
        if (n==1)
            return a;
        int mod = 1000000007;
        long[] dp = new long[n+1];
        dp[0] = 2;
        dp[1] = a;
        for (int j=2;j<=n;++j){
            dp[j] = ((a*dp[j-1]%mod)-(b*dp[j-2]%mod)+mod)%mod;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        long[] res = new long[t];
        for (int i=0;i<t;++i){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            res[i] = fun(a,b,n);
        }
        for (long x : res)
            System.out.println(x);
    }
}
