/**
 * @author hongguan.liu
 * Created at: 2021/3/29
 **/
public class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        return dfs(s, t);
    }

    public boolean checkSub(TreeNode s, TreeNode t){
        if (null == s && null == t) return true;
        else if (null == s && null != t) return false;
        else if (null != s && null == t) return false;
        else if (s.val != t.val) return false;

        return checkSub(s.left, t.left) && checkSub(s.right, t.right);
    }

    public boolean dfs(TreeNode o, TreeNode t){
        if (null == o){
            return false;
        }
        return checkSub(o, t) || dfs(o.left, t) || dfs(o.right, t);
    }
}
