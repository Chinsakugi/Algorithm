package leetCode;
//1497.检查数组对是否可以被 k 整除

import java.util.Arrays;

public class Problem1497 {
    public boolean canArrange(int[] arr, int k) {
        int[]mod = new int[k];
        for (int num: arr){
            ++mod[(num%k+k)%k];
        }
        for (int i=1;i+i<=k;++i){
            if (mod[i]!=mod[k-i]){
                return false;
            }
        }
        return mod[0]%2==0;
    }

    public static void main(String[] args) {
        int[] arr = {3,8,7,2};
        Problem1497 problem1497 = new Problem1497();
        System.out.println(problem1497.canArrange(arr,5));
    }
}
