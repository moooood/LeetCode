/**
 * @author hongguan.liu
 * Created at: 2021/4/1
 **/
public class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return traversal(root1, root2);
    }

    public TreeNode traversal(TreeNode root1, TreeNode root2){
        if (null == root1 && null == root2) return null;
        else if (null != root1 && null == root2){
            return root1;
        }
        else if (null != root2 && null == root1){
            return root2;
        }

        TreeNode root = new TreeNode(root1.val+root2.val);
        root.left = traversal(root1.left, root2.left);
        root.right = traversal(root1.right, root2.right);

        return root;
    }
}
