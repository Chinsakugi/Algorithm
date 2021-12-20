package NowCoder.ByteDance;

import java.util.Scanner;

public class ZJ1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //    1-n
        int[] pi = new int[n + 1];
        //    1-(n+1)
        long[] dp = new long[n + 2];
        //    1-n
        for(int i = 1; i <= n; ++i){
            pi[i] = sc.nextInt();
        }
        sc.close();
        long mod = (long)(1e9+7);
        //    2-(n+1)
        for(int i = 2; i <= n + 1; ++i){
            if(pi[i - 1] == i - 1){
                dp[i] = (dp[i - 1] + 2) % mod;
            }else{
                dp[i] = (dp[i - 1] + (dp[i - 1] - dp[pi[i - 1]]) + 2) % mod;
            }
        }
//         System.out.println(Arrays.toString(dp));
        System.out.println(dp[n + 1] < 0 ? dp[n + 1] + mod : dp[n + 1]);
    }
}
