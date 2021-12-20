package leetCode;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class Problem217 {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int num:nums){
            if (set.contains(num)){
                return true;
            }
            else {
                set.add(num);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Problem217 solution = new Problem217();
        int[] nums= {1,2,3,1};
        System.out.println(solution.containsDuplicate(nums));
    }
}
