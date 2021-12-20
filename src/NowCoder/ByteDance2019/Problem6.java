package NowCoder.ByteDance2019;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x =1024 - n;
        int sum = 0;
        sum += x / 64;
        x = x %64;
        sum += x / 16;
        x = x%16;
        sum += x/4;
        x = x %4;
        sum += x;
        System.out.println(sum);
    }
}
