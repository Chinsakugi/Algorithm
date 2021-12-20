package LeetcodeTop;

public class T75 {
    public void sortColors(int[] nums) {
        int n = nums.length;
        if (n==1)
            return;
        int l = 0, r = n-1;
        int temp;
        for (int i=0;i<=r;++i){
            while ( i<=r && nums[i]==2){
                temp = nums[i];
                nums[i] = nums[r];
                nums[r] = temp;
                --r;
            }
            if (nums[i]==0){
                temp = nums[i];
                nums[i] = nums[l];
                nums[l] = temp;
                ++l;
            }
        }
    }
}
