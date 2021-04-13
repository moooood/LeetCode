/**
 * @author hongguan.liu
 * Created at: 2021/4/11
 **/
public class ByteDance {
    int[] ans = new int[1];


    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int Solution(TreeNode root){
        traversal(root);
        return ans[0];
    }

    public int traversal(TreeNode node){
        if (null == node) return 0;

        int leftPathCount = traversal(node.left);
        int rightPathCount = traversal(node.right);

        int tempL = 0;
        if (null != node.left && node.left.val == node.val){
            tempL = leftPathCount + 1;
        }

        int tempR = 0;
        if (null != node.right && node.right.val == node.val){
            tempR = rightPathCount + 1;
        }

        ans[0] = Math.max(ans[0], tempL + tempR);
        return Math.max(tempL, tempR);
    }

    public static void main(String[] args){
        TreeNode node1 = new ByteDance().new TreeNode(1);
        TreeNode node2 = new ByteDance().new TreeNode(1);
        TreeNode node3 = new ByteDance().new TreeNode(1);
        TreeNode node4 = new ByteDance().new TreeNode(2);

        node1.left = node2;
        node1.right = node3;
        node2.right = node4;

        System.out.println(new ByteDance().Solution(node1));

    }
}
