
/**
 * @author hongguan.liu
 * Created at: 2021/4/1
 **/
public class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        while (null != root){
            if (root.val > val) root = root.left;
            else if (root.val < val) root = root.right;
            else return root;
        }
        return null;
    }
}
