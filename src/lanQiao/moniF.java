package lanQiao;

import java.util.Scanner;

public class moniF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[]arr = new int[n];

        for (int i =0;i<n;++i){
            arr[i] = scanner.nextInt();
        }
        int depth = (int)(Math.log(n)/Math.log(2)) + 1;

        int max = Integer.MIN_VALUE;
        int result = 1;
        int flag = 0;

        for (int i=1;i<=depth;++i){
            int num =(int)Math.pow(2,i-1);
            int j = 0;
            int sum = 0;
            while (flag<n&&j<num){
                sum += arr[flag];
                ++flag;
                ++j;
            }
            if (sum>max){
                max = sum;
                result = i;
            }
        }

        System.out.println(result);
    }
}
