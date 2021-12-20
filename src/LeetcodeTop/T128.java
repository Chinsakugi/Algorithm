package LeetcodeTop;

import java.util.HashSet;
import java.util.Set;

public class T128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);
        int len = 0;
        for (int num : set){
            if (!set.contains(num-1)){
                int currentNum = num;
                int currentLen = 1;
                while (set.contains(currentNum+1)){
                    currentNum += 1;
                    currentLen +=1;
                }
                len = Math.max(len,currentLen);
            }
        }
        return len;
    }
}
