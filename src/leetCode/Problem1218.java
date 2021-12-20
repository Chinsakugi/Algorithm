package leetCode;

import java.util.HashMap;

public class Problem1218 {
    public int longestSubsequence(int[] arr, int difference) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 1;
        int[] dp = new int[n];
        dp[0] = 1;
        map.put(arr[0],0);
        for (int i=1;i<n;++i){
            if (map.containsKey(arr[i]-difference)){
                dp[i] = dp[map.get(arr[i]-difference)] + 1;
            }else{
                dp[i] = 1;
            }
            map.put(arr[i],i);
            max = Math.max(max,dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Problem1218 problem1218 = new Problem1218();
        int[] nums = {1,2,3,4};
        System.out.println(problem1218.longestSubsequence(nums,1));
    }
}
