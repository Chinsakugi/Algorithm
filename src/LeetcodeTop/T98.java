package LeetcodeTop;

public class T98 {
    public boolean isValidBST(TreeNode root) {
        if (root==null)
            return true;
        if (root.left==null && root.right==null)
            return true;
        boolean b1 = true;
        if (root.left!=null)
            b1 = root.left.val < root.val && maxNode(root.left).val < root.val;
        boolean b2 = true;
        if (root.right!=null)
            b2 = root.right.val > root.val && minNode(root.right).val > root.val;
        return b1 && b2 && isValidBST(root.left) && isValidBST(root.right);
    }

    public TreeNode maxNode(TreeNode root){
        if (root.right==null)
            return root;
        return maxNode(root.right);
    }

    public TreeNode minNode(TreeNode root){
        if (root.left==null)
            return root;
        return minNode(root.left);
    }
}
