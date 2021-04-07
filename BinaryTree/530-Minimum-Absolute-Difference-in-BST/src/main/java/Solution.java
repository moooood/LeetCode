import java.util.LinkedList;
import java.util.List;

/**
 * @author hongguan.liu
 * Created at: 2021/4/1
 **/
public class Solution {
//    List<Integer> record = new LinkedList<>();
//    public int getMinimumDifference(TreeNode root) {
//        traversal(root);
//        if (record.size() <= 1) return 0;
//        int ans = Integer.MAX_VALUE;
//
//        for (int i = 1; i < record.size(); i++){
//            ans = Math.min(record.get(i) - record.get(i-1), ans);
//        }
//        return ans;
//    }
//
//    public void traversal(TreeNode root){
//        if (null == root) return;
//
//        traversal(root.left);
//        record.add(root.val);
//        traversal(root.right);
//    }

    int result = Integer.MAX_VALUE;
    TreeNode pre;
    public void traversal(TreeNode cur){
        if (null == cur) return;
        traversal(cur.left);
        if (null != pre){
            result = Math.min(result, cur.val - pre.val);
        }
        pre = cur;
        traversal(cur.right);
    }

    public int getMinimumDifference(TreeNode root){
        traversal(root);
        return result;
    }

    public static void main(String[] args){
        TreeNode node1 = new TreeNode(1);
        node1.left = null;

        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(2);
        node1.right = node2;
        node2.left = node3;

        new Solution().getMinimumDifference(node1);
    }
}
