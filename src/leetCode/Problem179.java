package leetCode;

import java.util.Arrays;

public class Problem179 {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String res = "";
        for(int i =0;i<n-1;++i){
            for(int j = 0;j<n-1-i;++j){
                if(isLess(nums[j],nums[j+1])){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        if (nums[0]==0) {
            return "0";
        }
        for(int i=0;i<n;++i){
            res +=nums[i]+"";
        }
        return res;
    }

    static boolean isLess(int a, int b){
        String x = a+""+b+"";
        String y = b+""+a+"";
        int res = x.compareTo(y);
        return res <= 0;
    }

    public static void main(String[] args) {
        Problem179 problem = new Problem179();
        int[] nums = {3,30,34,5,9};
        System.out.println(problem.largestNumber(nums));
    }
}
