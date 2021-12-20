package tencent_top_50;

import java.util.Arrays;

public class T238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1;i<n;++i)
            res[i] = res[i-1] * nums[i-1];

        int r = 1;
        for (int i = n-1;i>=0;--i){
            res[i] = res[i] * r;
            r *=  nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        T238 solution = new T238();
        System.out.println(Arrays.toString(solution.productExceptSelf(nums)));
    }
}