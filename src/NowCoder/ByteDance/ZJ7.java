package NowCoder.ByteDance;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ZJ7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s=str.split(" ")[0]; 	//用于接收待处理的字符串
        int m=Integer.parseInt(str.split(" ")[1]);	//用来接收处理字符串的的次数m
        int res=0;

        //建立列表，装接收置,待处理的是26个字母a-z，每接收一个字母都要建立相应的ArrayList
        for(char ch='a';ch<='z';ch++) {
            ArrayList<Integer> positions=new ArrayList<Integer>();
            for(int i=0;i<s.length();i++) {
                if(ch==s.charAt(i)) {	//键盘接收来的字符刚好与ch表示的字符相同，则为键盘接收来的字符添加下标
                    positions.add(i);
                }
            }

            //如果只有1个字符或没有则跳出当前循环
            if(positions.size()<2) {
                continue;
            }


            //建立动态规划dp，一维装字母，另一维装位置，其维度与前面建立的positions的大小相等
            int size=positions.size();
            int dp[][]=new int[size][size];

            //dp[i][j]表示，把位置positions[i],,,positions[j]的字母移动到一起所需要的最少移动次数
            for(int j=0;j<size;j++) {
                dp[j][j+1]=positions.get(j+1)-positions.get(j)-1;
            }

            //当相同的字母在字符串中多次出现且不连续时，从两边网中间移动，保证移动次数最少。
            for(int len=2;len<size;len++) {
                for(int left=0;left<size-len;left++) {
                    int right=left+len;
                    dp[left][right]=dp[left+1][right-1]+positions.get(right)-positions.get(left)-1-(right-left-1);
                }
            }

            //最后比较
            for(int i=0;i<size;i++) {
                for(int j=i+1;j<size;j++) {

                    if(dp[i][j]<=m) {
                        res=Math.max(res, j-i+1);
                    }
                }
            }
        }
        System.out.println(res);
    }
}
