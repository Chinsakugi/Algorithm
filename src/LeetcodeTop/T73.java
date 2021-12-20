package LeetcodeTop;

import java.util.Arrays;

public class T73 {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean isZero = false;
        for (int i =0;i<m;++i){
            if (matrix[i][0]==0)
                isZero = true;
            for (int j=1;j<n;++j){
                if (matrix[i][j]==0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = m-1;i>=0;--i){
            for (int j=1;j<n;++j){
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
            if (isZero)
                matrix[i][0] = 0;
        }
    }

    public static void main(String[] args) {
        int[][] a ={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        T73 solution = new T73();
        solution.setZeroes(a);
        System.out.println(Arrays.deepToString(a));
    }
}
