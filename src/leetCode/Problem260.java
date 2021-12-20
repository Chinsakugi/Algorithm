package leetCode;

public class Problem260 {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        if (n==2)
            return new int[]{nums[0],nums[1]};

        int len = nums.length;
        int x = nums[0];
        for (int i =1;i< len;++i)
            x = x ^ nums[i];
        int index = 1;
        while ((x&index)==0)
            index <<= 1;
        int res1 = 0 , res2 = 0 ;
        for (int num:nums){
            if ((num&index)==0)
                res1 ^=num;
            else
                res2 ^=num;
        }
        return new int[]{res1,res2};
    }
}
