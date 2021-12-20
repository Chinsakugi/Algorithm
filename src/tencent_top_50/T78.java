package tencent_top_50;

import java.util.ArrayList;
import java.util.List;

public class T78 {
    List<Integer> t = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(0,nums);
        return ans;
    }

    public void backtrack(int cur, int[] nums){
        if (cur==nums.length){
            ans.add(new ArrayList<Integer>(t));
            return;
        }
        t.add(nums[cur]);
        backtrack(cur+1,nums);
        t.remove(t.size()-1);
        backtrack(cur+1,nums);
    }
}
