import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author hongguan.liu
 * Created at: 2021/3/23
 **/
public class Solution {

//    public List<Integer> preorderTraversal(TreeNode root){
//        List<Integer> ans = new LinkedList<>();
//        traversal(root, ans);
//        return ans;
//    }

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> ans = new LinkedList<>();
        Deque<TreeNode> st = new LinkedList<>();
        st.push(root);

        while (!st.isEmpty()) {
            TreeNode node = st.pop();
            if (null != node) {
                ans.add(node.val);
            } else {
                continue;
            }
            st.push(node.right);
            st.push(node.left);
        }
        return ans;
    }

    public void traversal(TreeNode node, List<Integer> record){
        if (null == node) return;

        record.add(node.val);
        traversal(node.left, record);
        traversal(node.right, record);
    }
}
