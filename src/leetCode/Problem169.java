package leetCode;

import java.util.Arrays;

public class Problem169 {
    public int majorityElement(int[] nums) {
        int n = nums.length / 2 + 1;
        Arrays.sort(nums);
        for (int i = 0;i + n <=nums.length;++i){
            if (nums[i] == nums[i+n-1]) {
                return nums[i];
            }
        }
        return 0;
    }
}
