import java.util.LinkedList;
import java.util.List;

/**
 * @author hongguan.liu
 * Created at: 2021/4/1
 **/
public class Solution {
    TreeNode pre = null;
    public boolean isValidBST(TreeNode root) {
        if (null == root) return true;

        boolean left = isValidBST(root.left);

        if (null != pre && pre.val >= root.val) return false;
        pre = root;

        boolean right = isValidBST(root.right);

        return left && right;
    }
}
