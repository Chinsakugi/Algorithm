package NowCoder.ByteDance2019;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] arr = new int[n];
        for (int i=0; i< n;++i)
            arr[i]=scanner.nextInt();

        int res = 0;
        for (int i=n-1;i>=0;--i){
            if ((arr[i]+res) % 2==0)
                res = (arr[i]+res) / 2;
            else
                res = (arr[i]+res) / 2 + 1;
        }
        System.out.println(res);
    }
}
