package codeTest.Alibaba1029;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.nextLine();
        int[] arr1 = new int[a];
        for (int i=0;i<a;++i)
            arr1[i] = scanner.nextInt();
        scanner.nextLine();
        int[] arr2 = new int[b];
        for (int i=0;i<b;++i)
            arr2[i] = scanner.nextInt();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int[] dp = new int[n+1];
        dp[0] = 0;
        int r1 = a-1,r2 = b-1;

        for (int i=1;i<=n;++i){
            int x = dp[i-1]+arr1[r1];
            int y = (i>=2&&r2>=0)?(dp[i-2]+arr2[r2]):0;
            if (x>=y){
                r1--;
                dp[i] = x;
            }else {
                dp[i] = y;
                r2--;
            }
        }
        System.out.println(dp[n]);
    }
}
