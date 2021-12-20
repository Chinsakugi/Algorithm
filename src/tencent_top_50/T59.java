package tencent_top_50;

import java.util.Arrays;

public class T59 {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int num = 1;
        int l = 0, r = n-1, u = 0, d = n -1;
        while (num<=n * n) {
            for (int i = l; i <= r; ++i) {
                res[u][i] = num;
                num++;
            }
            u++;
            for (int i = u; i <= d; ++i) {
                res[i][r] = num;
                num++;
            }
            r--;
            for (int i = r; i >= l; --i) {
                res[d][i] = num;
                num++;
            }
            d--;
            for (int i = d;i>=u;--i) {
                res[i][l] = num;
                num++;
            }
            l++;
        }
        return res;
    }

    public static void main(String[] args) {
        T59 solution = new T59();
        System.out.println(Arrays.deepToString(solution.generateMatrix(4)));
    }
}
