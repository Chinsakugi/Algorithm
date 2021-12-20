package tencent_top_50;

public class T33 {
        public int search(int[] nums, int target) {
            int len = nums.length;
            if (len==0)
                return -1;
            if (len==1)
                return nums[0]==target?0:-1;
            int l = 0, r = len - 1;
            int mid;
            while (l <= r){
                mid = l + (r - l) / 2;
                if (nums[mid]==target)
                    return mid;
                if (nums[0] <= nums[mid]){
                    if (nums[0] <= target && target < nums[mid])
                        r = mid-1;
                    else
                        l = mid + 1;
                } else {
                    if (nums[mid] < target && target <=nums[len-1])
                        l = mid + 1;
                    else
                        r = mid - 1;
                }
            }
            return -1;
        }


    public static void main(String[] args) {
        T33 solution = new T33();
        int[] num ={3,5,1};
        System.out.println(solution.search(num,3));
    }
}
