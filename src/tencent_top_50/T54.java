package tencent_top_50;

import java.util.ArrayList;
import java.util.List;

public class T54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int l = 0, r = n-1, u = 0, d = m - 1;
        List<Integer> res= new ArrayList<>();
        while (l <= r && u <= d){
            for (int i =l;i<=r;++i)
                res.add(matrix[u][i]);
            u++;
            if (u>d)
                break;
            for (int i = u;i<=d;++i)
                res.add(matrix[i][r]);
            r--;
            if (l>r)
                break;
            for (int i=r;i>=l;--i)
                res.add(matrix[d][i]);
            d--;
            if (u>d)
                break;
            for (int i = d;i>=u;--i)
                res.add(matrix[i][l]);
            l++;
        }
        return  res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        T54 solution = new T54();
        System.out.println(solution.spiralOrder(matrix));
    }
}
