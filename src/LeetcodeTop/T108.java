package LeetcodeTop;

public class T108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return bst(nums,0,nums.length-1);
    }

    public TreeNode bst(int[] nums, int l, int r){
        if (l>r)
            return null;
        int mid = l + (r-l)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = bst(nums,l,mid-1);
        node.right = bst(nums,mid+1,r);
        return node;
    }
}
