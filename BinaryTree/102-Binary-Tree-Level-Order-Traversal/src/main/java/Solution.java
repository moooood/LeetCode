import apple.laf.JRSUIUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author hongguan.liu
 * Created at: 2021/3/24
 **/
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        if (null == root){
            return ans;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new LinkedList<>();

            for(int i = 1; i <= size; i++){
                TreeNode node = queue.poll();

                if (null != node){
                    level.add(node.val);
                }

                if (null != node.left){
                    queue.offer(node.left);
                }

                if (null != node.right){
                    queue.offer(node.right);
                }
            }
            ans.add(level);
        }
        return ans;
    }
}
