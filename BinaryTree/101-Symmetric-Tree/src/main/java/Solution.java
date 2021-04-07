import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author hongguan.liu
 * Created at: 2021/3/26
 **/
public class Solution {
//    public boolean isSymmetric(TreeNode root) {
//        if (null == root){
//            return false;
//        }
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        while(!queue.isEmpty()){
//            int size = queue.size();
//            List<Integer> level = new LinkedList<>();
//
//            for (int i = 0; i < size; i++){
//                TreeNode node = queue.poll();
//                if (null != node){
//                    level.add(node.val);
//                    queue.offer(node.left);
//                    queue.offer(node.right);
//                }else{
//                    level.add(Integer.MIN_VALUE);
//                }
//
//            }
//
//            int left = 0;
//            int right = level.size() - 1;
//
//            while (left < right){
//                if (!level.get(left).equals(level.get(right))){
//                    return false;
//                }
//                left ++;
//                right --;
//            }
//        }
//        return true;
//    }
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        return compare(root.left, root.right);
    }

    public boolean compare(TreeNode left, TreeNode right){
        if (null == left && null != right) return false;
        else if (null != left && null == right) return false;
        else if (null == left && null == right) return true;
        else if (left.val != right.val) return false;

        boolean outside = compare(left.left, right.right);
        boolean inside = compare(left.right, right.left);
        return outside && inside;
    }
}
