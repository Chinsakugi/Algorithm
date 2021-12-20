package leetCode;

public class Problem81 {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        if (n==1) {
            return target==nums[0];
        }
        int flag = 0;
        while (nums[flag]<=nums[flag+1]){
            ++flag;
        }

        int mid = n-1;
        int left;
        int right;
        if (target>nums[mid]){
            left = 0;
            right = flag;
        }
        else if (target<nums[mid]){
            left = flag + 1;
            right = n-1;
        }
        else {
            return true;
        }
        while (left<=right){
            mid = (left + right) / 2;
            if (target > nums[mid]){
                left = mid + 1;
            }
            else if (target<nums[mid]){
                right = mid;
            }
            else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Problem81 p = new Problem81();
        int[] nums = {2,5,6,0,0,1,2};
        System.out.println(p.search(nums,0));
    }
}
