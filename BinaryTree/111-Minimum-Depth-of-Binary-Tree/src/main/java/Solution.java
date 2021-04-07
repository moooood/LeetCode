/**
 * @author hongguan.liu
 * Created at: 2021/3/28
 **/
public class Solution {
    public int minDepth(TreeNode root) {
        return getDepth(root);
    }

    public int getDepth(TreeNode node){
        if (null == node) return 0;

        int leftDepth = getDepth(node.left);
        int rightDepth = getDepth(node.right);

        if (null == node.left && null != node.right){
            return 1 + rightDepth;
        }

        if (null != node.left && null == node.right){
            return 1 + leftDepth;
        }

        return 1 + Math.min(leftDepth, rightDepth);
    }
}
