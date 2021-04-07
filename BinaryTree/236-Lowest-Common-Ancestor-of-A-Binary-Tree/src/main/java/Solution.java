/**
 * @author hongguan.liu
 * Created at: 2021/4/2
 **/
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (q == root || p == root || null == root) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (null != left && null != right) return root;

        if (null == left && null != right) return right;
        else if (null != left && null == right) return left;
        else{
            return null;
        }
    }
}
