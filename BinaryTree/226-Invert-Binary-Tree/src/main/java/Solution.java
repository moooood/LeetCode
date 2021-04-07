/**
 * @author hongguan.liu
 * Created at: 2021/3/24
 **/
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (null == root) return null;

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
