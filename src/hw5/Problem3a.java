package hw5;

import java.util.HashSet;

public class Problem3a {
    public int shortestPath(int[][] c) {
        int n = c.length;

        int[][] result = new int[n + 2][n + 2];      //初始化

        for (int i = 0; i < n + 2; ++i) {
            for (int j = 0; j < n + 2; ++j) {
                result[i][j] = 100;
            }
        }

        int[][] d = new int[n + 2][n + 2];             //初始化
        for (int i = 0; i < n + 2; ++i) {
            for (int j = 0; j < n + 2; ++j) {
                if (i == 0 || i == n + 1 || j == 0 || j == n + 1)
                    d[i][j] = 100;
                else
                    d[i][j] = c[i - 1][j - 1];
            }
        }

        int x = 0;
        while (x < n) {
            for (int i = 1; i < n + 1; ++i) {
                for (int j = 1; j < n + 1; ++j) {
                    if (i == 1 && j == 1)
                        result[i][j] = 0;
                    else
                        result[i][j] = Math.min(Math.min(result[i][j - 1] + d[i][j - 1], result[i][j + 1] + d[i][j + 1]),
                                Math.min(result[i + 1][j] + d[i + 1][j], result[i - 1][j] + d[i - 1][j]));
                }
            }
            ++x;
        }

        for (int i = 1; i < n + 1; ++i) {
            for (int j = 1; j < n + 1; ++j) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        return result[n][n] + d[n][n];
    }

    public static void main(String[] args) {
        int[][] c = {
                {1, 10, 1, 1, 1}, {1, 10, 1, 10, 1}, {1, 1, 1, 10, 1}, {10, 10, 10, 10, 1}, {10, 10, 10, 10, 1}
        };
        int[][] d = {
                {1, 2, 3, 4}, {2, 3, 1, 4}, {4, 2, 3, 1}, {1, 1, 3, 2}
        };

        int[][] e ={
                {1,1,1,10,10},{10,10,1,10,10},{1,1,1,10,10},{1,10,10,10,10},{1,1,1,1,1,}
        };
        Problem3a problem3a = new Problem3a();
        System.out.println(problem3a.shortestPath(e));
    }
}
