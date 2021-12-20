package tencent_top_50;

public class T230 {
    int res;
    int p = 0;
    int k;
    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }

    public  void dfs(TreeNode root){
        if (root==null)
            return;
        dfs(root.left);
        p++;
        if (p==k)
            res = root.val;
        dfs(root.right);
    }
}
