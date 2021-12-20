package NowCoder.ByteDance;

public class T5904 {
    public int countMaxOrSubsets(int[] nums) {
        int num = 0;
        for (int n : nums)
            num = num | n;
        int res = 0;
        int size = 1<<nums.length;
        for (int mark=1;mark<size;++mark){
            int temp = 0;
            for (int i=0;i<nums.length;++i){
                if ((mark&(1<<i))!=0)
                    temp |= nums[i];
            }
            if (temp==num)
                ++res;
        }
        return res;
    }
}
