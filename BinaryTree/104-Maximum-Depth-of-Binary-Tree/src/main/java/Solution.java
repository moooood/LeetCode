import apple.laf.JRSUIUtils;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author hongguan.liu
 * Created at: 2021/3/24
 **/
public class Solution {

    public int maxDepth(TreeNode root) {
        return getDepth(root);
    }

    public int getDepth(TreeNode node){
        if (null == node) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);

        int maxDepth = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            maxDepth++;

            for (int i = 0; i < size; i++){
                TreeNode front = queue.poll();

                if (null != front.left) queue.offer(front.left);
                if (null != front.right) queue.offer(front.right);
            }
        }
        return maxDepth;
    }
}
