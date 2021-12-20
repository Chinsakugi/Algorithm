package leetCode;

public class Problem563 {
    int res = 0;
    public int findTilt(TreeNode root) {
        if (root==null)
            return 0;
        recur(root);
        return res;
    }

    public void recur(TreeNode root){
        if (root==null)
            return;
        res += Math.abs(sumNode(root.left)-sumNode(root.right));
        recur(root.left);
        recur(root.right);
    }

    public int sumNode(TreeNode root){
        if (root==null)
            return 0;
        return sumNode(root.left) + sumNode(root.right) + root.val;
    }
}
