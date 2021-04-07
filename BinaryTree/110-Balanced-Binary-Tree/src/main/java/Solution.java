/**
 * @author hongguan.liu
 * Created at: 2021/3/29
 **/
public class Solution {
    public boolean isBalanced(TreeNode root) {
        return getDepth(root) != -1;
    }

    public int getDepth(TreeNode node){
        if (null == node) return 0;

        int leftDepth = getDepth(node.left);
        if (leftDepth == -1) return -1;
        int rightDepth = getDepth(node.right);
        if (rightDepth == -1) return -1;

        int result;
        if(Math.abs(leftDepth - rightDepth) > 1){
            result = -1;
        }else{
            result = 1 + Math.max(leftDepth, rightDepth);
        }
        return result;
    }
}
