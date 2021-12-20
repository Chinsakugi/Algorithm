package tencent_top_50;

import java.util.Arrays;

public class T16 {
    public int threeSumClosest(int[] nums, int target) {
        int len = nums.length;
        Arrays.sort(nums);
        int res = 10000000;
        for (int i=0;i<len-2;++i){
            if (i>0&&nums[i]==nums[i-1])
                continue;
            int l = i+1, r = len-1;
            while (l < r){
                int sum = nums[i]+nums[l]+nums[r];
                res = Math.abs(res-target) < Math.abs(sum-target)?res : sum;
                if (nums[i]+nums[l]+nums[r]==target)
                    return target;
                else if (nums[i]+nums[l]+nums[r]>target){
                    int k = r -1;
                    while (l<k && nums[k] == nums[r])
                        --k;
                    r = k;
                }
                else {
                    int k = l + 1;
                    while (k<r && nums[k]==nums[l])
                        k++;
                    l = k;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        T16 solution = new T16();
        int[] nums = {-1,2,1,-4};
        int target = -5;
        System.out.println(solution.threeSumClosest(nums,target));
    }
}
