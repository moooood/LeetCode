/**
 * @author hongguan.liu
 * Created at: 2021/4/2
 **/
public class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (null == root){
            TreeNode node = new TreeNode(val);
            return node;
        }
        if (root.val > val) root.left = insertIntoBST(root.left, val);
        if (root.val < val) root.right = insertIntoBST(root.right, val);
        return root;
    }
}
