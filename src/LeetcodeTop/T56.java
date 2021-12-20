package LeetcodeTop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class T56 {
    public int[][] merge(int[][] intervals) {
        int n= intervals.length;
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        int a = intervals[0][0], b =intervals[0][1];
        for (int i=1;i<n;++i){
            if (intervals[i][0]>b) {
                list.add(new int[]{a, b});
                a = intervals[i][0];
                b = intervals[i][1];
            }
            else{
                a = Math.min(a,intervals[i][0]);
                b = Math.max(b,intervals[i][1]);
            }
        }
        list.add(new int[]{a, b});
        return list.toArray(new int[list.size()][2]);
    }

    public static void main(String[] args) {
        T56 solution = new T56();
        int[][] nums = {{1,3}};
        System.out.println(Arrays.deepToString(solution.merge(nums)));
    }
}
