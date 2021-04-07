/**
 * @author hongguan.liu
 * Created at: 2021/4/2
 **/
public class Solution {

    public TreeNode traversal(TreeNode cur, TreeNode p, TreeNode q){
        if (null == cur) return cur;

        if (cur.val > p.val && cur.val > q.val){
            TreeNode left = traversal(cur.left, p, q);
            if (null != left){
                return left;
            }
        }

        if (cur.val < p.val && cur.val < q.val){
            TreeNode right = traversal(cur.right, p, q);
            if (null != right){
                return right;
            }
        }
        return cur;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return traversal(root, p, q);
    }
}
