package codeTest.Alibaba1029;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
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
        int x = a -1;
        int y = b - 1;
        int maxSum = 0;
        while (n > 0){
            if (x>1&&n>=2&&y>=0){
                if (arr1[x]+arr1[x-1]<=arr2[y]){
                    n -= 2;
                    maxSum+=arr2[y];
                    y--;
                }else{
                    n -= 2;
                    maxSum += (arr1[x] + arr1[x - 1]);
                    x -= 2;
                }
            }else{
                if (n>=2){
                    n -= 2;
                    maxSum+=arr2[y];
                    y--;
                }else {
                    if (x >= 0) {
                        n -= 1;
                        maxSum += arr1[x];
                        x--;
                    } else {
                        maxSum = maxSum - arr1[0] + arr2[y];
                        n--;
                        x++;
                        y--;
                    }
                }
            }
        }
        System.out.println(maxSum);
    }
}
