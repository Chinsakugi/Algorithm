package leetCode;

import java.util.Arrays;

public class Problem268 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int l = 0, r = nums.length-1;
        while (l<r){
            int mid = l + (r - l) / 2;
            if (nums[mid]==mid)
                l++;
            else
                r = mid;
        }
        return nums[l]==l?l+1:l;
    }

    public static void main(String[] args) {
        Problem268 problem268 = new Problem268();
        int[] nums = {3,0,1};
        System.out.println(problem268.missingNumber(nums));
    }
}
