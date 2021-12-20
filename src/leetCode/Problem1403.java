package leetCode;
//1403. 非递增顺序的最小子序列

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1403 {
    public List<Integer> minSubsequence(int[] nums) {
        List result = new ArrayList();
        Arrays.sort(nums);
        int sum = 0;
        for (int a : nums){
            sum += a;
        }
        int total=0;
        for (int i=nums.length-1;i>=0;--i){
            total +=nums[i];
            result.add(nums[i]);
            if (total>sum-total)
                break;
        }
        return result;
    }
}
