package LeetcodeTop;

public class T162 {
    public int findPeakElement(int[] nums) {
        int len = nums.length;
        int l = 0, r = len-1;
        while (l<=r){
            int mid = l + (r - l)/2;
            boolean b1 = mid == 0 || nums[mid] > nums[mid - 1];
            boolean b2 = mid == len - 1 || nums[mid] > nums[mid + 1];
            if (b1 && b2)
                return mid;
            else if (b1)
                l = mid + 1;
            else if (b2)
                r = mid;
            else
                l = mid+1;
        }
        return 0;
    }

    public static void main(String[] args) {
        T162 solution = new T162();
        int[] nums = {1,2,3,4};
        System.out.println(solution.findPeakElement(nums));
    }
}
