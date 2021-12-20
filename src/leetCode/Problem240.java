package leetCode;

public class Problem240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int x = 0, y =n-1;
        while (true){
            if (matrix[x][y]==target)
                return true;
            else if(target > matrix[x][y]){
                x++;
                if (x>=m)
                    return false;
            }else {
                y--;
                if (y<0)
                    return false;
            }
        }
    }
}
