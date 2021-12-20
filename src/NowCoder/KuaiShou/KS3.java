package NowCoder.KuaiShou;

import java.util.Scanner;

public class KS3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(boxSum(n));
    }

    public static int boxSum(int n){
        if (n<=2)
            return -1;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = -1;
        dp[2] = -1;
        int x=-1,y=-1,z=-1;
        for (int i= 3;i<=n;++i){
            if (i>=7&&dp[i-7]!=-1)
                dp[i] = dp[i-7] + 1;
            else if (i>=5&&dp[i-5]!=-1)
                dp[i] =dp[i-5] + 1;
            else if (dp[i-3]!=-1)
                dp[i] = dp[i-3] + 1;
            else
                dp[i] = -1;
        }
        return dp[n];
    }
}
