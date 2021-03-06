package leetCode;

public class Problem154 {
    public int findMin(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        int mid;
        while (l<r){
            mid = l + (r - l) / 2;
            if (nums[mid]>nums[r]){
                l = mid + 1;
            }
            else if(nums[mid]<nums[r]){
                r = mid;
            }
            else {
                r--;
            }
        }
        return nums[l];
    }

    public static void main(String[] args) {
        Problem154 problem = new Problem154();
        int[] nums = {3,3,1,3};
        System.out.println(problem.findMin(nums));
    }
}
