package leetcode周赛.Day1024;

public class T5908 {
    public int countHighestScoreNodes(int[] parents) {
        int res = 0;
        int n = parents.length;
        int[] arr= new int[n];
        for (int i=0;i<n;++i){
            if (parents[i]==-1) {
                continue;
            }
            arr[parents[i]]++;
            arr[i]++;
        }
        for (int x : arr){
            if (x==1)
                res++;
        }
        return res;
    }
}
