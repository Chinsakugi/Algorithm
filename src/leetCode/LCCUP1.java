package leetCode;

import java.util.Arrays;

public class LCCUP1 {
    public int purchasePlans(int[] nums, int target) {
        int n=nums.length;
        int num = 0;
        int i = 0;

        while (i<n-1){
            if (nums[i]<target){
                int j=i+1;
                while (j<n){
                    if (nums[j]<=target-nums[i]) {
                        ++num;
                    }
                    ++j;
                }
            }
            ++i;
        }
        return num%1000000007;
    }

    public static void main(String[] args) {
        LCCUP1 pro = new LCCUP1();
        int[] nums = {2,5,3,5};
        System.out.println(pro.purchasePlans(nums,6));
    }
}
