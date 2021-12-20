package leetCode;

import java.util.*;

public class Problem102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) {
            return res;
        }
        while (!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for(int i=1;i<=size;++i){
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left!=null){
                    queue.add(node.left);
                }
                if (node.right!=null){
                    queue.add(node.right);
                }
            }
            res.add(level);
        }
        return res;
    }
}
