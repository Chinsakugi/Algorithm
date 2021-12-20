package NowCoder.ByteDance;

import java.util.Scanner;

public class ZJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int oper = sc.nextInt();
        String str = sc.next();
        System.out.println(windowSolve(str, oper, len));
    }

    private static int windowSolve(String str, int oper, int len) {
        int res=Integer.MIN_VALUE;
        int left=0, right=0;  // 滑动窗口设置两个指针lr
        int an=0, bn=0;   //用来计数窗口中a/b的个数

        while(right<len){
            if(str.charAt(right)=='a') {
                an++;
            }else {
                bn++;
            }
            // right一直往右走，寻找可行解
            if(an<=oper||bn<=oper){
                right++;
            }else{  // 从可行解中找最优解：left开始往右走
                // 此时窗口中已经出现了oper个可以改变的字符,更新结果
                res = Math.max(res, right-left);
                // left指针往左走，窗口中退出一个字符相应的计数减1，
                // 而right指针新指的字符计数已经在刚进入while语句时的if判断已加1
                if(str.charAt(left)=='a'){
                    left++;
                    an--;
                }else{
                    left++;
                    bn--;
                }
                right++;
            }
        }
        res = Math.max(res, right-left);
        return res;
    }

}
