package NowCoder.algorithm;

import java.util.ArrayList;

public class NC45 {
    ArrayList<Integer> res1 = new ArrayList<>();
    ArrayList<Integer> res2 = new ArrayList<>();
    ArrayList<Integer> res3 = new ArrayList<>();

    public int[][] threeOrders (TreeNode root) {
        preOrder(root);
        inOrder(root);
        postOrder(root);
        if (res1.size()==0)
            return new int[3][0];
        int[][] res = new int[3][res1.size()];
        for (int i = 0;i<res1.size();++i)
            res[0][i] = res1.get(i);
        for (int i = 0;i<res2.size();++i)
            res[1][i] = res2.get(i);
        for (int i = 0;i<res3.size();++i)
            res[2][i] = res3.get(i);
        return res;
    }

    public void preOrder(TreeNode root){
        if (root==null)
            return;
        res1.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(TreeNode root){
        if (root==null)
            return;
        inOrder(root.left);
        res2.add(root.val);
        inOrder(root.right);
    }

    public void postOrder(TreeNode root){
        if (root==null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        res3.add(root.val);
    }
}
