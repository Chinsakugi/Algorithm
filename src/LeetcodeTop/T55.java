package LeetcodeTop;

public class T55 {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int rightmost = 0;
        for (int i=0;i<n;++i){
            if (i <=rightmost){
                rightmost = Math.max(rightmost,i+nums[i]);
                if (rightmost >= n-1)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        T55 solution = new T55();
        int[] nums = {5,9,3,2,1,0,2,3,3,1,0,0};
        System.out.println(solution.canJump(nums));
    }
}
