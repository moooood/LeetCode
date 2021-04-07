/**
 * @author hongguan.liu
 * Created at: 2021/3/30
 **/
public class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {

    }

    public int pathSum(TreeNode node){
        if (null == node) return 0;

        int leftValue = pathSum(node.left);
        int rightValue = pathSum(node.right);

        
    }
}
