package leetCode;

public class Problem34 {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] result = {-1,-1};
        int i = (n-1)/2;
        int start = 0, end = n-1;
        while (end - start>=0){
            if (nums[i]>target)
                end = i-1;
            else if(nums[i]<target)
                start = i + 1;
            else
                break;
            i = (start + end) / 2;
        }
        if (end<start||end<0)
            return result;
        int left = i, right = i;
        while (left>=0&&nums[left]==target){
            --left;
        }
        while (right<n&&nums[right]==target){
            ++right;
        }
        result[0] = left+1;
        result[1] = right-1;
        return result;
    }

    public static void main(String[] args) {
        Problem34 p = new Problem34();
        int[] num ={1};
        int[] result = p.searchRange(num,1);
        System.out.println(result[0]+" "+ result[1]);
    }
}
