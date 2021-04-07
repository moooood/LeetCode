/**
 * @author hongguan.liu
 * Created at: 2021/3/30
 **/
public class Solution {
    int maxLen = Integer.MIN_VALUE;
    int maxLeftValue;
    public int findBottomLeftValue(TreeNode root) {
        traversal(root, 0);
        return maxLeftValue;
    }

    void traversal(TreeNode root, int leftLen){
         if (null == root.left && null == root.right){
             if (leftLen > maxLen){
                 maxLen = leftLen;
                 maxLeftValue = root.val;
             }
         }

         if (null != root.left){
             traversal(root.left, leftLen + 1);
         }
        if (null != root.right){
            traversal(root.right, leftLen + 1);
        }
        return;
    }
}
