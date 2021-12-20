package NowCoder.KuaiShou;

import java.util.Scanner;

public class KS1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] d = new int[n];
        for (int i =0;i<n;++i)
            d[i] = scanner.nextInt();

        int index1=0,index2 = n;
        long sum1 = 0, sum2 =0, maxSum = 0;
        while (index1<=index2){
            if (sum1==sum2){
                maxSum = Math.max(sum1, maxSum);
                sum1 += d[index1];
                index1++;
            }else if (sum1 > sum2){
                sum2 += d[index2-1];
                index2--;
            }else {
                sum1 += d[index1];
                index1++;
            }
        }
        System.out.println(maxSum);
    }
}
