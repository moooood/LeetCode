import apple.laf.JRSUIUtils;

/**
 * @author hongguan.liu
 * Created at: 2021/3/24
 **/
public class Solution {
    int ans = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        traversal(root);
        return ans;
    }

    public int traversal(TreeNode node){
        if (null == node) return 0;

        int leftGain = Math.max(traversal(node.left), 0);
        int rightGain = Math.max(traversal(node.right), 0);

        int priceNewPath = node.val + leftGain + rightGain;
        ans = Math.max(ans, priceNewPath);

        return node.val + Math.max(leftGain, rightGain);
    }
}
