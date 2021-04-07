import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author hongguan.liu
 * Created at: 2021/3/24
 **/
public class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new LinkedList<>();
        if (root == null){
            return ans;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new LinkedList<>();

            for (int i = 1; i <= size; i++){
                Node node = queue.poll();
                level.add(node.val);

                for (int j = 0; j < node.children.size(); j++){
                    queue.offer(node.children.get(j));
                }
            }
            ans.add(level);
        }
        return ans;
    }
}
