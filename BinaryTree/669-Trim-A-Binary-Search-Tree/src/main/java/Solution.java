/**
 * @author hongguan.liu
 * Created at: 2021/4/2
 **/
public class Solution {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (null == root) return null;

        if (root.val < low){
            TreeNode right = trimBST(root.right, low, high);
            return right;
        }
        if (root.val > high){
            TreeNode left = trimBST(root.left, low, high);
            return left;
        }
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        return root;
    }

    public static void main (String[] args){
        TreeNode root = new TreeNode(3);

        new Solution().trimBST(root, 2, 2);
    }
}
