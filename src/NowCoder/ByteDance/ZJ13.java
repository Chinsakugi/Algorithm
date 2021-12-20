package NowCoder.ByteDance;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ZJ13 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());

        int[][] arr = new int[n][2];
        for (int i = 0;i<n;++i){
            String[] s = reader.readLine().split(" ");
            arr[i][0] =Integer.parseInt(s[0]);
            arr[i][1] =Integer.parseInt(s[1]);

        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
               if (o1[1]==o2[1])
                   return o1[0] - o2[0];
               else
                   return o1[1] - o2[1];
            }
        });
        int max = -1;
        for (int i=arr.length-1;i>=0;i--){
            if (arr[i][0]>max){
                System.out.println(arr[i][0]+" "+arr[i][1]);
                max = arr[i][0];
            }
        }
    }
}
