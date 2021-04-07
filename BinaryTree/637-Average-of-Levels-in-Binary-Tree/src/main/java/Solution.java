import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author hongguan.liu
 * Created at: 2021/3/24
 **/
public class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new LinkedList<>();
        if (null == root){
            return ans;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            double sum = 0;

            for (int i = 1; i <= size; i++){
                TreeNode node = queue.poll();
                sum += node.val;

                if (null != node.left) queue.offer(node.left);
                if (null != node.right) queue.offer(node.right);
            }
            ans.add(sum/size);
        }
        return ans;
    }
}
