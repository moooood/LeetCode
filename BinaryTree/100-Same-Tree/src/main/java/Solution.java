/**
 * @author hongguan.liu
 * Created at: 2021/3/29
 **/
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return checkSame(p, q);
    }

    public boolean checkSame(TreeNode p, TreeNode q){
        if (null == p && null == q) return true;
        else if (null != p && null == q) return false;
        else if (null == p && null != q) return false;
        else if (p.val != q.val) return false;

        boolean checkLeft = checkSame(p.left, q.left);
        boolean checkRight = checkSame(p.right, q.right);

        return checkLeft&&checkRight;
    }

    public static void main(String[] args){
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);

        TreeNode q = new TreeNode(1);
        q.left = null;
        q.right = new TreeNode(2);

        new Solution().isSameTree(p, q);
    }
}
