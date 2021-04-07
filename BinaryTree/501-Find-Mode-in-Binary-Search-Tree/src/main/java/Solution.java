import java.util.*;

/**
 * @author hongguan.liu
 * Created at: 2021/4/2
 **/
public class Solution {
    int maxCount;
    int count;
    TreeNode pre;
    List<Integer> result = new LinkedList<>();

    public void searchBST(TreeNode root){
        if (null == root) return;

        searchBST(root.left);

        if (pre == null){
            count = 1;
        }else if (pre.val == root.val){
            count++;
        }else {
            count = 1;
        }
        pre = root;

        if (count == maxCount){
            result.add(root.val);
        }

        if (count > maxCount){
            maxCount = count;
            result.clear();
            result.add(root.val);
        }

        searchBST(root.right);
    }

    public int[] findMode(TreeNode root) {
        maxCount = 0;
        count = 0;
        searchBST(root);

        int[] ans = new int[result.size()];

        for (int i = 0; i < result.size(); i++){
            ans[i] = result.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(2);

        root.left = null;
        root.right = node1;
        node1.left = node2;

        System.out.println(Arrays.toString(new Solution().findMode(root)));
    }
}
