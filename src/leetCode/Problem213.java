package leetCode;

public class Problem213 {
    public int rob(int[] nums) {
        int n = nums.length;
        int i=0;
        int max = 0;
        while (i<n){
            int j =i;
            int sum = 0;
            boolean[] visit = new boolean[n];
            while (!visit[j]){
                sum += nums[j];
                visit[j] = true;
                if(visit[(j+1)%n]||visit[(j-1 + n)%n]) {
                    break;
                }
                j = (j + 2)%n;
            }
            max=Math.max(sum,max);
            ++i;
        }
        return max;
    }


    public static void main(String[] args) {
        Problem213 solution = new Problem213();
        int[] nums = {1,2,3,4,5,1,2,3,4,5};
        System.out.println(solution.rob(nums));
    }
}
