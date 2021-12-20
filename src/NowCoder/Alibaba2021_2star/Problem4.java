package NowCoder.Alibaba2021_2star;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m =scanner.nextInt();
        int a = scanner.nextInt();
        int b =scanner.nextInt();
        int res1 = 0, res2 = 0;
        for (int i =m;i>=1;--i){
            long x = (long) a * i / b;
            if (x*b== (long) a *i&&x>=1&&x<=n){
                res1 = (int) x;
                res2 = i;
                break;
            }
        }
        System.out.println(res1+" "+res2);
    }
}
