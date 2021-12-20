package LeetcodeTop;

import java.util.HashMap;

public class T105 {
    HashMap<Integer, Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        int n = preorder.length;
        for (int i = 0;i<n;++i)
            map.put(inorder[i],i);
        return help(preorder,inorder,0,n-1,0,n-1);
    }

    public TreeNode help(int[] preorder, int[] inorder, int pre_left, int pre_right, int in_left, int in_right){
        if (pre_left > pre_right)
            return null;
        TreeNode node = new TreeNode(preorder[pre_left]);
        int inorder_root = map.get(preorder[pre_left]);
        int size = inorder_root - in_left;
        node.left = help(preorder,inorder,pre_left+1,pre_left+size,in_left,inorder_root-1);
        node.right = help(preorder,inorder,pre_left+size+1,pre_right,inorder_root+1,in_right);
        return node;
    }
}
