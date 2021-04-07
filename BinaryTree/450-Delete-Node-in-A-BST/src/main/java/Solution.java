/**
 * @author hongguan.liu
 * Created at: 2021/4/2
 **/
public class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (null == root) return root;

        if (root.val == key){
            if (null == root.left) return root.right;
            else if (null == root.right) return root.left;
            else {
                TreeNode cur = root.right;
                while (null != cur.left){
                    cur = cur.left;
                }
                cur.left = root.left;
                TreeNode tmp = root;
                root = root.right;
                return root;
            }
        }
        if (root.val > key) root.left = deleteNode(root.left, key);
        if (root.val < key) root.right = deleteNode(root.right, key);
        return root;
    }
}
