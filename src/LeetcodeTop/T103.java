package LeetcodeTop;

import java.util.*;

public class T103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        if (root==null)
            return res;

        que.add(root);
        int flag = 0;
        while (!que.isEmpty()){
            Deque<Integer> temp = new LinkedList<>();
            int n =que.size();
            while (n>0){
                TreeNode node = que.poll();
                if (flag%2==0)
                    temp.addLast(node.val);
                else
                    temp.addFirst(node.val);
                if (node.left!=null)
                    que.add(node.left);
                if (node.right!=null)
                    que.add(node.right);
                --n;
            }
            res.add(new LinkedList<>(temp));
            flag++;
        }
        return res;
    }

    public static void main(String[] args) {
        T103 solution = new T103();
        TreeNode node1 = new TreeNode(3);
        node1.left = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        node1.right = node2;
        node2.left = new TreeNode(15);
        node2.right = new TreeNode(7);
        System.out.println(solution.zigzagLevelOrder(node1));
    }
}
