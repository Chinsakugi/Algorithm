package lanQiao;

import java.util.Arrays;
import java.util.Scanner;

public class tiaoyue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] nums = new int[n][m];
        for (int i=0;i<n;++i){
            for (int j=0;j<m;++j){
                int x = scan.nextInt();
                nums[i][j] = x;
            }
        }

        int[][] dp = new int[n+3][m+3];
        for (int i=0;i<n+3;++i){
            for (int j=0;j<m+3;++j){
                if (i<3){
                    dp[i][j]=Integer.MIN_VALUE;
                }
                else if (j<3){
                    dp[i][j]=Integer.MIN_VALUE;
                }
                else if (i==3&&j==3){
                    dp[i][j] = nums[0][0];
                }
                else {
                    int[] arr={dp[i][j-3],dp[i][j-2],dp[i-1][j-2],dp[i][j-1],dp[i-1][j-1]
                               ,dp[i-2][j-1],dp[i-1][j],dp[i-2][j],dp[i-3][j]};
                    dp[i][j] = nums[i-3][j-3] + Arrays.stream(arr).max().getAsInt();
                }
            }
        }

        System.out.println(dp[n+2][m+2]);

        scan.close();
    }
}
