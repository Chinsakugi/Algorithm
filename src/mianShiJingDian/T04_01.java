package mianShiJingDian;

public class T04_01 {
    boolean[] visit;
    public boolean findWhetherExistsPath(int n, int[][] graph, int start, int target) {
        for (int i = 0; i < graph.length; ++i)
        {
            if (graph[i][0] == start && graph[i][1] == target)
            {
                return true;
            }
        }
        visit = new boolean[graph.length];
        return dfs(start,target,graph);
    }

    public boolean dfs(int start, int target, int[][] graph){
        for (int i=0;i<graph.length;++i){
            if (!visit[i]){
                if (graph[i][0]==start && graph[i][1] == target)
                    return true;
            }
            visit[i] = true;
            if (graph[i][1] == target && dfs(start,graph[i][0],graph))
                return true;
            visit[i] = false;
        }
        return false;
    }
}
