import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author hongguan.liu
 * Created at: 2021/3/23
 **/
public class Solution {
//    public List<Integer> inorderTraversal(TreeNode root){
//        List<Integer> ans = new LinkedList<>();
//        traversal(root, ans);
//        return ans;
//    }

    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> ans = new LinkedList<>();
        Deque<TreeNode> st = new LinkedList<>();
        TreeNode cur = root;

        while (null != cur || !st.isEmpty()){
            if (null != cur){
                st.push(cur);
                cur = cur.left; //左
            }else{
                cur = st.pop();
                ans.add(cur.val); //中
                cur = cur.right;  //右
            }
        }
        return ans;
    }

    public void traversal(TreeNode node, List<Integer> record){
        if (null == node) return;

        traversal(node.left, record);
        record.add(node.val);
        traversal(node.right, record);
    }
}
