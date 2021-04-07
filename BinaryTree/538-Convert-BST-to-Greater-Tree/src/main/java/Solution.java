/**
 * @author hongguan.liu
 * Created at: 2021/4/2
 **/
public class Solution {
    int pre;
    void traversal(TreeNode cur){
        if (null == cur) return;
        traversal(cur.right);
        cur.val += pre;
        pre = cur.val;
        traversal(cur.left);
    }
    public TreeNode convertBST(TreeNode root) {
        pre = 0;
        traversal(root);
        return root;
    }
}
