package leetCode;

import java.util.Arrays;

public class Problem453 {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for (int num : nums)
            min = Math.min(min,num);
        int res = 0;
        for (int num: nums)
            res+=num - min;
        return res;
    }
}
