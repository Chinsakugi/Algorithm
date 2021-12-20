package leetCode;

public class Problem704 {
    public int search(int[] nums, int target) {
        int mid;
        int l = 0, r = nums.length-1;
        while (l <= r){
            mid = l + (r - l) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid]<target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }
}
