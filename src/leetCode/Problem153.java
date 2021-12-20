package leetCode;

public class Problem153 {
    public int findMin(int[] nums) {
        int n = nums.length;
        if (n==1) {
            return nums[0];
        }
        int l = 0;
        int r = n-1;
        int mid;
        int min = 5001;
        while (l<=r){
            mid = (l + r) / 2;
            if (nums[mid]>nums[r]){
                l=mid+1;
            }
            else {
                r=mid;
            }
            min = Math.min(min,nums[mid]);
            if (l==r&&l==mid){
                break;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Problem153 solution = new Problem153();
        int[]arr = {2,1};
        System.out.println(solution.findMin(arr));
     }
}
