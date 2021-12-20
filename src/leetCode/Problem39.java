package leetCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Problem39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int len = candidates.length;
        List<List<Integer>> result = new ArrayList<>();
        if (len==0){
            return result;
        }

        Deque<Integer> path = new ArrayDeque<>();
        dfs(candidates,0,len,target,path,result);
        return result;
    }

    private void dfs(int[] candidates, int begin, int len, int target, Deque<Integer> path,List<List<Integer>> result){
        if (target<0){
            return;
        }
        if (target == 0){
            result.add(new ArrayList<>(path));
        }

        for (int i=begin;i<len;++i){
            path.addLast(candidates[i]);
            System.out.println("递归之前 => " + path + "，剩余 = " + (target - candidates[i]));
            dfs(candidates,i,len,target-candidates[i],path,result);
            path.removeLast();
            System.out.println("递归之后 => " + path);
        }
    }

    public static void main(String[] args) {
        Problem39 solution = new Problem39();
        int[] candidates = new int[]{2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> res = solution.combinationSum(candidates, target);
        System.out.println("输出 => " + res);
    }
}
