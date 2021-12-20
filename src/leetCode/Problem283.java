package leetCode;

public class Problem283 {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        for (int i=0;i<n;++i){
            if (nums[i]==0){
                int temp;
                for(int j=i;j<n-1;++j){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Problem283 problem = new Problem283();
        int[] nums = {0,0,1};
        problem.moveZeroes(nums);
    }
}
