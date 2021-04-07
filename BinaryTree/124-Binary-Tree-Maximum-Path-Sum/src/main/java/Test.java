/**
 * @author hongguan.liu
 * Created at: 2021/3/24
 **/
public class Test {
    int ans = Integer.MIN_VALUE;

    public int solve(TreeNode root){
        travelsal(root);
        return ans;
    }

    public int travelsal(TreeNode root){
        if (null ==  root) return 0;

        int leftPathCount = travelsal(root.left);
        int rightPathCount = travelsal(root.right);

        int maxPathCount = leftPathCount + rightPathCount;
        ans = Math.max(ans, maxPathCount);

        return Math.max(leftPathCount, rightPathCount) + 1;
    }

    public static void main(String[] args){
        TreeNode A = new TreeNode();
        TreeNode B = new TreeNode();
        TreeNode C = new TreeNode();
        TreeNode D = new TreeNode();
        TreeNode E = new TreeNode();
        TreeNode F = new TreeNode();
        TreeNode G = new TreeNode();
        TreeNode H = new TreeNode();
        TreeNode I = new TreeNode();
        A.left = B;
        A.right = C;
        C.left = D;
        D.left = F;
//        F.left = G;
        C.right = E;
//        E.left = H;
//        H.right = I;

        System.out.println(new Test().solve(A));
    }
}
