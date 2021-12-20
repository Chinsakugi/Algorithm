package NowCoder.ByteDance2019;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        int[]arr = new int[n];
        for (int i = 0;i<n;++i)
            arr[i] = scanner.nextInt();

        if (n<3)
            System.out.println(0);
        int  sum = 0;
        for (int i=0;i<n-2;++i){
            for (int j=i+1;j<n-1;++j){
                if (arr[j]-arr[i]>m)
                    break;
                for (int k=j+1;k<n;++k){
                    if (arr[k]-arr[i]<=m)
                        sum = (sum+1)%99997867;
                    else
                        break;
                }
            }
        }
        System.out.println(sum);
    }
}
