package hw5;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    boolean wordBreak(String s, Set<String> dict)
    {
        int len=s.length();
        //动态规划，dp[i]表示0~i-1可以被分词
        boolean[] dp = new boolean[len+1];
        for(int i=0;i<=len;i++)
            dp[i]=false;
        dp[0]=true;
        //仔细思考问题：对于一个子串，找到在主串中要比较的起点、长度
        for(int start=0;start<len;start++) //起点
        {
            int endIndex=start;
            for(int end = start+1; dp[start] && end<=len; end++) //注意要要求0~start-1可以分词，不然没意义
            {
                //学会用字符串的substr(起点，长度)和set的find功能
                if(dict.contains(s.substring(start,end))) {
                    endIndex = end;
                }
            }
            if (endIndex != start) {
                dp[endIndex ] = true;
                System.out.println(s.substring(start, endIndex));
            }
        }
        if (!dp[len])
            System.out.println("Incomplete Dict!");
        return dp[len];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "algorithmisinteresting";
        //String s = new String("algorithmisinterest");
        Set<String> dict = new HashSet<String>();
        dict.add("alg");
        dict.add("algorithm");
        dict.add("is");
        dict.add("rest");
        dict.add("interest");
        dict.add("interesting");
        dict.add("interested");
        System.out.println(solution.wordBreak(s,dict));
    }
}
