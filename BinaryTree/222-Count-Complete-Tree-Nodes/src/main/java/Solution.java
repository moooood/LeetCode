import java.util.LinkedList;
import java.util.Queue;

/**
 * @author hongguan.liu
 * Created at: 2021/3/29
 **/
public class Solution {
    public int countNodes(TreeNode root) {
        return getNodesNum(root);
    }

//    public int getNodesNum(TreeNode node){
//        if (null == node) return 0;
//
//        int leftNum = getNodesNum(node.left);
//        int rightNum = getNodesNum(node.right);
//        int treeNum = leftNum + rightNum + 1;
//
//        return treeNum;
//    }

    public int getNodesNum(TreeNode node){
        if (null == node) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        int ans = 0;
        queue.offer(node);

        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++){
                TreeNode frontNode = queue.poll();
                ans++;
                if (null != node.left) queue.offer(node.left);
                if (null != node.right) queue.offer(node.right);
            }
        }
        return ans;
    }
}
