import apple.laf.JRSUIUtils;

import java.util.*;

/**
 * @author hongguan.liu
 * Created at: 2021/3/23
 **/
public class Solution {
//    public List<Integer> postorderTraversal(TreeNode root){
//        List<Integer> ans = new LinkedList<>();
//        traversal(root, ans);
//        return ans;
//    }
    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> ans = new LinkedList<>();
        Deque<TreeNode> st = new LinkedList<>();

        st.push(root);

        while (!st.isEmpty()){
            TreeNode node = st.pop();

            if (null != node){
                ans.add(node.val);
            }else{
                continue;
            }

            st.push(node.left);
            st.push(node.right);
        }
        Collections.reverse(ans);
        return ans;
    }

    public void traversal(TreeNode node, List<Integer> record){
        if (null == node) return;

        traversal(node.left, record);
        traversal(node.right, record);
        record.add(node.val);
    }
}
