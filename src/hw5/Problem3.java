package hw5;

public class Problem3 {
    public int min4(int a,int b, int c, int d){
        return Math.min(Math.min(a, b), Math.min(c, d));
    }

    public int shortestPath(int[][] c){
        int n = c.length;

        int[][]result = new int[n+2][n+2];
        for (int i =0;i<n+2;++i){
            for (int j =0;j<n+2;++j){
                    result[i][j] = 100;
            }
        }

        for (int i=1;i<n+1;++i) {
            for (int j = 1;j<n+1;++j){
                if (i==1&&j==1)
                    result[i][j] = 0;
                else if (i==1&&j<n)
                    result[i][j] = Math.min(result[i][j-1]+c[i-1][j-2],Math.min(result[i+1][j]+c[i][j-1],result[i][j+1]+c[i-1][j]));
                else if (i==n&&j==1)
                    result[i][j] = Math.min(result[i-1][j]+c[i-2][j-1],result[i][j+1]+c[i-1][j]);
                else if (i==n&&j<n)
                    result[i][j] = Math.min(result[i][j-1]+c[i-1][j-2],Math.min(result[i][j+1]+c[i-1][j],result[i-1][j]+c[i-2][j-1]));
                else if (j==1&&i<n)
                    result[i][j] = Math.min(result[i+1][j]+c[i][j-1],Math.min(result[i][j+1]+c[i-1][j],result[i-1][j]+c[i-2][j-1]));
                else if (i==1&&j==n)
                    result[i][j] =Math.min(result[i][j-1]+c[i-1][j-1],result[i+1][j]+c[i][j-1]);
                else if (j==n&&i<n)
                    result[i][j] = Math.min(result[i][j-1]+c[i-1][j-2],Math.min(result[i+1][j]+c[i][j-1],result[i-1][j]+c[i-2][j-1]));
                else if (i==n&&j==n)
                    result[i][j] = Math.min(result[i][j-1]+c[i-1][j-2],result[i-1][j]+c[i-2][j-1]);
                else
                    result[i][j] = Math.min(Math.min(result[i+1][j]+c[i][j-1],result[i-1][j]+c[i-2][j-1]),Math.min(result[i][j-1]+c[i-1][j-2],result[i][j+1]+c[i-1][j]));
            }
        }

        for (int i=0;i<n+2;++i){
            System.out.println(result[i][0]+" "+result[i][1]+" "+result[i][2]+" "+result[i][3]+" "+result[i][4]+" "+result[i][5]+" ");
        }
        System.out.println("************************");

        for (int i =1;i<n+1;++i){
            for (int j =1;j<n+1;++j){
                result[i][j] = Math.min(result[i][j],min4(result[i][j-1]+c[i-1][j-2],result[i+1][j]+c[i][j-1],result[i][j+1]+c[i-1][j],result[i-1][j]+c[i-2][j-1]));
            }
        }

        for (int i=0;i<n+2;++i){
            System.out.println(result[i][0]+" "+result[i][1]+" "+result[i][2]+" "+result[i][3]+" "+result[i][4]+" "+result[i][5]+" ");
        }

        return result[n][n] + c[n-1][n-1];
    }

    public static void main(String[] args) {
        int[][] c = {
                {1,10,1,1,1},{1,10,1,10,1},{1,1,1,10,1},{10,10,10,10,1},{10,10,10,10,1}
        };
        int [][] d = {
                {1,2,3,4},{2,3,1,4},{4,2,3,1},{1,1,3,2}
        };
        Problem3 problem3 = new Problem3();
        System.out.println(problem3.shortestPath(d));
    }
}
