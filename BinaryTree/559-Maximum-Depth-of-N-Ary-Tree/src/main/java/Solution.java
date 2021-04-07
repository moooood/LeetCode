/**
 * @author hongguan.liu
 * Created at: 2021/3/28
 **/
public class Solution {
    public int maxDepth(Node root){
        return getDepth(root);
    }

    public int getDepth(Node node){
        if (null == node) return 0;

        int depth = 0;
        for (int i = 0; i < node.children.size(); i++){
            depth = Math.max(depth, getDepth(node.children.get(i)));
        }

        return 1 + depth;
    }
}
