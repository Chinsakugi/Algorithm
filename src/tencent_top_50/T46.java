package tencent_top_50;

import java.util.ArrayList;
import java.util.List;

public class T46 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    boolean[] visit;

    public static void main(String[] args) {
        T46 solution = new T46();
        int[] nums = {1, 2, 3};
        System.out.println(solution.permute(nums).toString());
    }

    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0)
            return res;
        visit = new boolean[nums.length];
        backtrack( nums);
        return res;
    }

    public void backtrack(int[] nums) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i=0;i<nums.length;++i){
            if (!visit[i]){
                visit[i] = true;
                temp.add(nums[i]);
                backtrack(nums);
                temp.remove(temp.size()-1);
                visit[i] = false;
            }
        }
    }
}
