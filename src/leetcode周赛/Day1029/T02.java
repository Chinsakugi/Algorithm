package leetcode周赛.Day1029;

import java.util.Arrays;

public class T02 {
    public int[] analysisHistogram(int[] heights, int cnt) {
        Arrays.sort(heights);
        int index = cnt-1;
        int minNum = Integer.MAX_VALUE;
        int left =0,  right = cnt-1;
        while (index<heights.length){
            int temp =  heights[index]-heights[index+1-cnt];
            if (temp<minNum){
                left = index+1-cnt;
                right = index;
                minNum = temp;
            }
            index++;
        }
        int[] res = new int[cnt];
        for (int i=0;i<cnt;++i)
            res[i] = heights[left+i];
        return res;
    }
}
