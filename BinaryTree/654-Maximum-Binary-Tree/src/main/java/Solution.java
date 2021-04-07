/**
 * @author hongguan.liu
 * Created at: 2021/4/1
 **/
public class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length ==0) return null;
        return traversal(nums, 0, nums.length);
    }

    public TreeNode traversal(int[] nums, int begin, int end){
        if (begin == end) return null;

        int delimiterIndex = 0;
        int record;
        int maxValue = Integer.MIN_VALUE;
        for(record = begin; record < end; record++){
            if (nums[record] > maxValue){
                maxValue = nums[record];
                delimiterIndex = record;
            }
        }

        TreeNode root = new TreeNode(maxValue);

        if (end - begin == 1) return root;

        root.left = traversal(nums, begin, delimiterIndex);
        root.right = traversal(nums, delimiterIndex + 1, end);

        return root;
    }

    public static void main(String[] args){
        int[] test = {3,2,1,6,0,5};
        new Solution().constructMaximumBinaryTree(test);
    }
}
