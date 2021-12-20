package codeTest.Boke1102;

import java.util.ArrayList;

public class Problem2 {

      public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
          this.val = val;
        }
      }

    ArrayList<Integer> list = new ArrayList<>();

    public int kthSmallest (TreeNode root, int k) {
        mid(root);
        return list.get(k-1);
    }

    public void mid(TreeNode root){
          if (root==null)
              return;
          mid(root.left);
          list.add(root.val);
          mid(root.right);
    }
}
