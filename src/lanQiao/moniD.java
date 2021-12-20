package lanQiao;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class moniD {

    public static void main(String[] args) {
        int[][] dir={{1,0},{0,-1},{0,1},{-1,0}};
        int n= 30,m=50;
        String[]mp = new String[30];
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<n;++i){
            mp[i] = scanner.nextLine();
        }

        Boolean[][] visit = new Boolean[n][m];
        for (int i=0;i<n;++i){
            for (int j=0;j<m;++j){
                visit[i][j] = false;
            }
        }
        visit[0][0] = true;
        String s = "";
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(0,0,0,""));

        while (!queue.isEmpty()){
            Node node = queue.poll();
            if (node.x==n-1&&node.y==m-1){
                System.out.println(node.step);
                System.out.println(node.str);
            }

            for (int i=0;i<4;++i){
                int tx = node.x + dir[i][0];
                int ty = node.y + dir[i][1];
                if (tx<0||tx>=n||ty<0||ty>=m||visit[tx][ty]||mp[tx].charAt(ty)=='1'){
                    continue;
                }
                if (i==0){
                    s="D";
                }
                else if (i==1){
                    s="L";
                }
                else if(i==2){
                    s="R";
                }
                else {
                    s="U";
                }
                visit[tx][ty] = true;
                queue.offer(new Node(tx,ty,node.step+1,node.str+s));
            }
        }

    }

}

class Node{
    int x;
    int y;
    int step;
    String str;
    public Node(int x,int y,int step,String str){
        this.x = x;
        this.y = y;
        this.step=step;
        this.str=str;
    }
}



