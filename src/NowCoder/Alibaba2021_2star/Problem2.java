package NowCoder.Alibaba2021_2star;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem2 {
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();

    void backTrack(int n, int m,int k, ArrayList<Integer>path){
        if (path.size()==m){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i=k;i<=n;++i){
            path.add(i);
            backTrack(n,m,i+1,path);    //i+1 不是 k+1
            path.remove(path.size()-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Problem2 problem2 = new Problem2();
        problem2.backTrack(n,m,1,new ArrayList<>());
        for (int i=0;i<problem2.res.size();++i){
            for (int j=0;j<m;++j)
                System.out.print(problem2.res.get(i).get(j)+" ");
            System.out.println();
        }
    }
}
